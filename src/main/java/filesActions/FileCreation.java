package filesActions;

import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String args[]) {

        File myFile = new File("C:\\Users\\37129\\Desktop\\myFile.docx");
        try {
            boolean isFileCreated = myFile.createNewFile();
            System.out.println(isFileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
