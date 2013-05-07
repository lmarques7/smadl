package org.smadl.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.smadl.smadl.Entity;
import org.smadl.smadl.ProvidedService;
import org.smadl.smadl.SocialMachine;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class SMADLJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
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
  protected void _infer(final Entity element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    EList<SocialMachine> _entities = element.getEntities();
    for (final SocialMachine sm : _entities) {
      String _name = sm.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      JvmGenericType _class = this._jvmTypesBuilder.toClass(sm, _firstUpper);
      IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            EList<ProvidedService> _wrapperInterface = sm.getWrapperInterface();
            for (final ProvidedService operation : _wrapperInterface) {
              EList<JvmMember> _members = it.getMembers();
              String _name = operation.getName();
              JvmTypeReference _newTypeRef = SMADLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(operation, String.class);
              final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable it) {
                          EList<XExpression> _expressions = operation.getExpressions();
                          for (final XExpression exp : _expressions) {
                            String _string = exp.toString();
                            it.append(_string);
                          }
                        }
                      };
                    SMADLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                  }
                };
              JvmOperation _method = SMADLJvmModelInferrer.this._jvmTypesBuilder.toMethod(operation, _name, _newTypeRef, _function);
              SMADLJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members, _method);
            }
          }
        };
      _accept.initializeLater(_function);
    }
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof Entity) {
      _infer((Entity)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
