package org.smadl.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtype.XtypePackage;
import org.smadl.smadl.SmadlPackage;
import org.smadl.smadl.SmadlPackage.Literals;
import org.smadl.smadl.SocialMachine;
import org.smadl.validation.AbstractSMADLValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class SMADLValidator extends AbstractSMADLValidator {
  public final static String CYCLIC_DEPENDENCY = "smadl.issue.cyclicDependency";
  
  protected List<EPackage> getEPackages() {
    ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(
      SmadlPackage.eINSTANCE, 
      XbasePackage.eINSTANCE, 
      TypesPackage.eINSTANCE, 
      XtypePackage.eINSTANCE);
    return _newArrayList;
  }
  
  @Check
  public Collection<SocialMachine> checkSocialMachineSelfOrCyclicReference(final SocialMachine sm) {
    final Procedure1<Set<SocialMachine>> _function = new Procedure1<Set<SocialMachine>>() {
        public void apply(final Set<SocialMachine> cycle) {
          int _size = cycle.size();
          boolean _equals = (_size == 1);
          if (_equals) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("The Social Machine \'");
            String _name = sm.getName();
            _builder.append(_name, "");
            _builder.append("\' cannot relate to itself.");
            SocialMachine _head = IterableExtensions.<SocialMachine>head(cycle);
            SMADLValidator.this.error(_builder.toString(), _head, Literals.SOCIAL_MACHINE__NAME, SMADLValidator.CYCLIC_DEPENDENCY);
          } else {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("There is a cyclic relationship that involves Social Machines ");
            final Function1<SocialMachine,String> _function = new Function1<SocialMachine,String>() {
                public String apply(final SocialMachine it) {
                  String _name = it.getName();
                  return _name;
                }
              };
            Iterable<String> _map = IterableExtensions.<SocialMachine, String>map(cycle, _function);
            String _join = IterableExtensions.join(_map, ", ");
            _builder_1.append(_join, "");
            SocialMachine _head_1 = IterableExtensions.<SocialMachine>head(cycle);
            SMADLValidator.this.error(_builder_1.toString(), _head_1, Literals.SOCIAL_MACHINE__NAME, SMADLValidator.CYCLIC_DEPENDENCY);
          }
        }
      };
    Collection<SocialMachine> _findDependentTasks = this.findDependentTasks(sm, _function);
    return _findDependentTasks;
  }
  
  private Collection<SocialMachine> findDependentTasks(final SocialMachine it, final Procedure1<? super Set<SocialMachine>> cycleHandler) {
    LinkedHashSet<SocialMachine> _xblockexpression = null;
    {
      LinkedHashSet<SocialMachine> _linkedHashSet = new LinkedHashSet<SocialMachine>();
      final LinkedHashSet<SocialMachine> socialMachines = _linkedHashSet;
      this.internalFindDependentTasksRec(it, socialMachines);
      final LinkedHashSet<SocialMachine> result = CollectionLiterals.<SocialMachine>newLinkedHashSet();
      boolean changed = true;
      boolean _while = changed;
      while (_while) {
        {
          changed = false;
          List<SocialMachine> _list = IterableExtensions.<SocialMachine>toList(socialMachines);
          for (final SocialMachine t : _list) {
            EList<SocialMachine> _depends = t.getDepends();
            boolean _containsAll = result.containsAll(_depends);
            if (_containsAll) {
              changed = true;
              result.add(t);
              socialMachines.remove(t);
            }
          }
        }
        _while = changed;
      }
      boolean _and = false;
      boolean _isEmpty = socialMachines.isEmpty();
      boolean _not = (!_isEmpty);
      if (!_not) {
        _and = false;
      } else {
        boolean _notEquals = (!Objects.equal(cycleHandler, null));
        _and = (_not && _notEquals);
      }
      if (_and) {
        cycleHandler.apply(socialMachines);
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  private void internalFindDependentTasksRec(final SocialMachine sm, final Set<SocialMachine> set) {
    boolean _add = set.add(sm);
    boolean _not = (!_add);
    if (_not) {
      return;
    }
    EList<SocialMachine> _depends = sm.getDepends();
    for (final SocialMachine t : _depends) {
      this.internalFindDependentTasksRec(t, set);
    }
  }
}
