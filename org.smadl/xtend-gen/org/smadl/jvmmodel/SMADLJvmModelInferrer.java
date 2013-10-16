package org.smadl.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.smadl.configuration.SMADLOutputProvider;
import org.smadl.smadl.ComputationalUnit;
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
  @Inject
  private XbaseCompiler xBaseCompiler;
  
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
      {
        String _name = sm.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        JvmGenericType smClassDefault = this._jvmTypesBuilder.toClass(sm, _firstUpper);
        IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(smClassDefault);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              it.setAbstract(true);
              it.setPackageName(SMADLOutputProvider.DEFAULT_OUTPUT_PACKAGE);
              EList<ComputationalUnit> _constructors = sm.getConstructors();
              for (final ComputationalUnit constructor : _constructors) {
                EList<JvmMember> _members = it.getMembers();
                final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
                    public void apply(final JvmConstructor it) {
                      EList<JvmFormalParameter> _parameters = constructor.getParameters();
                      for (final JvmFormalParameter p : _parameters) {
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        String _name = p.getName();
                        JvmTypeReference _parameterType = p.getParameterType();
                        JvmFormalParameter _parameter = SMADLJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
                        SMADLJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
                      }
                      XExpression _body = constructor.getBody();
                      SMADLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                    }
                  };
                JvmConstructor _constructor = SMADLJvmModelInferrer.this._jvmTypesBuilder.toConstructor(constructor, _function);
                SMADLJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members, _constructor);
              }
              EList<ProvidedService> _wrapperInterface = sm.getWrapperInterface();
              for (final ProvidedService op : _wrapperInterface) {
                {
                  JvmTypeReference _elvis = null;
                  JvmTypeReference _returnType = op.getReturnType();
                  if (_returnType != null) {
                    _elvis = _returnType;
                  } else {
                    JvmTypeReference _newTypeRef = SMADLJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(it, "void");
                    _elvis = ObjectExtensions.<JvmTypeReference>operator_elvis(_returnType, _newTypeRef);
                  }
                  JvmTypeReference returnType = _elvis;
                  EList<JvmMember> _members_1 = it.getMembers();
                  String _name = op.getName();
                  final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        EList<JvmFormalParameter> _parameters = op.getParameters();
                        for (final JvmFormalParameter param : _parameters) {
                          EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                          String _name = param.getName();
                          JvmTypeReference _parameterType = param.getParameterType();
                          JvmFormalParameter _parameter = SMADLJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _parameterType);
                          SMADLJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
                        }
                        it.setAbstract(true);
                        final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                            public void apply(final ITreeAppendable it) {
                              StringConcatenation _builder = new StringConcatenation();
                              _builder.append("                            ");
                              _builder.newLine();
                              it.append(_builder);
                            }
                          };
                        SMADLJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                      }
                    };
                  JvmOperation _method = SMADLJvmModelInferrer.this._jvmTypesBuilder.toMethod(op, _name, returnType, _function_1);
                  SMADLJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_1, _method);
                }
              }
            }
          };
        _accept.initializeLater(_function);
      }
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
