//Write a Java program that reads the content of a file called data.txt and displays it line by line.
package File;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:/Users/palla/eclipse-workspace/Java_Practice_Code/src/File/data.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}