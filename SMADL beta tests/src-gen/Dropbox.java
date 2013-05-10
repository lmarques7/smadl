import java.io.File;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Dropbox {
  public Dropbox(final String baseURL) {
  }
  
  public Dropbox(final String baseURL, final Integer simultaneosUsers) {
  }
  
  public String saveFile(final File newFile) {
    String _xblockexpression = null;
    {
      Integer x = Integer.valueOf(26);
      String _xifexpression = null;
      boolean _greaterThan = ((x).intValue() > 25);
      if (_greaterThan) {
        String _print = InputOutput.<String>print("Testing");
        _xifexpression = _print;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public List<File> listFilesInFolder(final String folder) {
    return CollectionLiterals.<File>newArrayList();
  }
}
