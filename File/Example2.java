//Write a Java program that reads a file called input.txt 
//and counts the number of characters in it using FileReader.
package File;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        int charCount = 0;

        try (FileReader reader = new FileReader("C:/Users/palla/eclipse-workspace/Java_Practice_Code/src/File/input.txt")) {
            while (reader.read() != -1) {
                charCount++;
            }
            System.out.println("Number of characters: " + charCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}