package smadl_gen;

import java.io.File;

@SuppressWarnings("all")
public abstract class MetaContainer {
  public abstract void deployApplication(final File WARFile);
  
  public abstract void listCloudFiles();
}
