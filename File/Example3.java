//Write a Java program that appends text "Hello, World!" to a file called append.txt using FileWriter.
package File;
import java.io.FileWriter;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C:/Users/palla/eclipse-workspace/Java_Practice_Code/src/File/append.txt", true)) {
            writer.write("Hello, World!\n");
            System.out.println("Text appended successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}