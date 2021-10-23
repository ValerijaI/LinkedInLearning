package filesActions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

    public static void main(String args[]) {

        File myFile = new File("example.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {

        }
    }
}
