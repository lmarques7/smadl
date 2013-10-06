package org.smadl.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.smadl.smadl.Entity
import static org.smadl.configuration.SMADLOutputProvider.*

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class SMADLJvmModelInferrer extends AbstractModelInferrer {
    
    // Maybe used for xbase transformations
    @Inject XbaseCompiler xBaseCompiler
    
    /**
     * convenience API to build and initialize JVM types and their members.
     */
    @Inject extension JvmTypesBuilder

    /**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
    def dispatch void infer(Entity element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {    

        // Here you explain how your model is mapped to Java elements, by writing the actual translation code.
        // An implementation for the initial hello world example could look like this:
        for (sm : element.entities) {
            var smClassDefault = sm.toClass(sm.name.toFirstUpper)
            acceptor.accept(smClassDefault).initializeLater [
                it.abstract = true
                it.packageName = DEFAULT_OUTPUT_PACKAGE
                for (constructor : sm.constructors) {
                    members += constructor.toConstructor[
                        for (p : constructor.parameters) {
                            parameters += p.toParameter(p.name, p.parameterType)
                        }
                        body = constructor.body
                    ]
                }
                for (op : sm.wrapperInterface) {
                    var returnType = op.returnType ?: newTypeRef("void");
                    members += op.toMethod(op.name, returnType) [
                        for (param : op.parameters) {
                            parameters += param.toParameter(param.name, param.parameterType)
                        }
                        it.abstract = true
                        body = [
                            append ('''
                            
                            ''')
                        ]
                    ]
                }
            ]
        }
    }
}
