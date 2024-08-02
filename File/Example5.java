//Write a Java program that reads a file called input.txt, replaces every occurrence of the word "old" with "new", and writes the result to output.txt.
package File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example5 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:/Users/palla/eclipse-workspace/Java_Practice_Code/src/File/input5.txt");
             FileWriter writer = new FileWriter("C:/Users/palla/eclipse-workspace/Java_Practice_Code/src/File/output5.txt")) {

            int character;
            StringBuilder content = new StringBuilder();
            
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }

            String newContent = content.toString().replace("old", "new");
            writer.write(newContent);

            System.out.println("Text replaced successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}