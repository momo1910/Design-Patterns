package com.designpatterns.Design.CreationalPatterns.PrototypePattern;

import static java.lang.Thread.sleep;

public class FIleReaderUtils {

      public File getFileInfo(String name,String location) throws InterruptedException {
          System.out.println("Opening the File from The location"+ name + location);
          File file= new File();
          file.setFilename(name);
          file.setLocation(location);
          System.out.println("File is opened :{ }  and contents are getting copied" + name );
          sleep(6000);
          file.setContentStatus("Completed");
          return file;

      }

}
