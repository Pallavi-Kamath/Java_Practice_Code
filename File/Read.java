package File;

import java.io.FileReader;

class Read{
	public static void main(String args[])
	{
		
		try(FileReader reader= new FileReader("example.txt"))
		{
			int character;
			while((character = reader.read())!=-1)
			{
				System.out.print((char) character); 
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}