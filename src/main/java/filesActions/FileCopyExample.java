package filesActions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyExample {

    public static void main(String [] args) {

        Path source = Paths.get("example.txt");
        Path destination = Paths.get("C:\\Users\\37129\\Desktop\\exampleCopy.docx");
        try {
//            Files.copy(source, destination);
            Files.copy(source, destination, REPLACE_EXISTING);
        } catch (IOException ioException) {
            Logger.getLogger(FileCopyExample.class.getName()).log(Level.SEVERE, null, ioException);
            ioException.getStackTrace();
        }
    }
}
