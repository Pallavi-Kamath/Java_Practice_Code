package File;

import java.io.FileWriter;
import java.io.IOException;

class Write
{
	public static void main(String args[])
	{
		String data="Hello World!!!   Writting Data to file";
		
		try(FileWriter writer =new FileWriter("example.txt"))
		{
			
			writer.write("Hello World!!!   Writting Data to fil");
			System.out.println("Data writter Successfully!!!!");
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
