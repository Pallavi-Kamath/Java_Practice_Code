//FileInputStream Example: Reading from a File
package File;

import java.io.FileInputStream;
import java.io.IOException;

public class Example7 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.bin")) {
            int byteData;
            StringBuilder content = new StringBuilder();
            while ((byteData = fis.read()) != -1) {
                content.append((char) byteData);
            }
            System.out.println("File content: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}