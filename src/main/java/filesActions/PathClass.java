package filesActions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {

    public static void main(String [] args) {

        Path path = Paths.get("example2.txt");

        try {
            Files.deleteIfExists(path);
        } catch (IOException ioException) {

        }

        Path path1 = Paths.get("C:\\Learning\\LinkedIn\\Ex_Files_Oracle_Java_2_Operators_Decision_Statements\\CertificateOfCompletion_Oracle Java Certification 2. Operators and Decision Statements.pdf");
        System.out.println(path1.getParent());
        System.out.println(path1.getRoot());
        System.out.println(path1.getFileName());
    }
}
