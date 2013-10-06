package smadl_gen;

import java.util.Comparator;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public abstract class Toggl {
  public Toggl(final Integer x, final String test, final Double n, final Comparator<String> tt) {
    int y = ((x).intValue() + 10);
    InputOutput.<String>println(test);
  }
  
  public abstract void nothing();
}
