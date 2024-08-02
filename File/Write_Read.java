//open a file with file name "example.java". and write into file.
//then display content of that file only using FileWriter And FileReader in java

package File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Write_Read
{
	public static void main(String args[])
	{
		String data="Hello World!!!";
		String filename="exam.txt"; 
		try(FileWriter writer =new FileWriter(filename))
		{
			
			writer.write(data);
			System.out.println("Data writter Successfully!!!!");
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try(FileReader reader= new FileReader(filename))
		{	
			int character;
			while((character = reader.read())!=-1) 
			{
				System.out.print((char)character);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
