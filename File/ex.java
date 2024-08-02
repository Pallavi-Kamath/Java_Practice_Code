package File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("Lakshmi.txt");
             FileWriter writer = new FileWriter("destination.txt")) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}