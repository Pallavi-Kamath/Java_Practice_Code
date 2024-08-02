//Write a Program to Copy Text from One File to Another Using FileWriter and FileReader
package File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Example1
{
	public static void main(String args[])
	{
		try(FileReader reader = new FileReader("C:/Users/palla/eclipse-workspace/Java_Practice_Code/src/File/Source.txt");
				FileWriter writer = new FileWriter ("C:/Users/palla/eclipse-workspace/Java_Practice_Code/src/File/Destination.txt"))
		{
			int character;
			while((character =reader.read())!=-1)
			{
				writer.write(character);
			}
			System.out.println("Data Copied from Sorce file to Destination File");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}