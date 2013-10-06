package smadl_gen;

import java.io.File;
import java.util.List;

@SuppressWarnings("all")
public abstract class MyNewSocialMachine {
  public MyNewSocialMachine(final String name, final Integer initialPort) {
    String config = name;
  }
  
  public abstract List<File> listFilesInDropboxFolder(final String folder);
  
  public abstract void createFacebookPost(final String text);
}
