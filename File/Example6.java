//FileOutputStream Example: Writing to a File
package File;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {
        String data = "Hello, World! This is a binary file example.";
        byte[] dataBytes = data.getBytes(); // Convert string to byte array

        try (FileOutputStream fos = new FileOutputStream("example.bin")) {
            fos.write(dataBytes);
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}