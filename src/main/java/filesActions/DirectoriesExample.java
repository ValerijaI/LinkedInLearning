package filesActions;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {

    public static void main(String [] args) {

        FilenameFilter filenameFilter = (file, fileName) -> {
            return fileName.contains(".");
        };

        String [] contents = new File(".").list(filenameFilter);
        for (String str : contents) {
            System.out.println(str);
        }
        new File("myDirectory").mkdir();
    }
}
