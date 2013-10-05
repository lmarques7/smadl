import java.io.File;
import java.util.List;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public abstract class Dropbox {
  public Dropbox(final String baseURL) {
  }
  
  public Dropbox(final String baseURL, final Integer simultaneosUsers) {
    int x = 10;
    final int y = 20;
    int z = (x + y);
    InputOutput.<Integer>println(Integer.valueOf(z));
  }
  
  public abstract void saveFile(final File newFile);
  
  public abstract List<File> listFilesInFolder(final String folder);
}
