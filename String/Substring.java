package String;

class Substring{
	public static void main(String args[])
	{
		String txt = "Pallavi Kamath";
		String str1 = "Pallavi";
		String str2 = "ABC";
		

		boolean result1 = txt.contains(str1);
		
		if(result1)
		{
			System.out.println("Contains sub string");
		}
		else
		{
			System.out.println("No Sub String");
		}
		
		
		boolean result2 = txt.contains(str2);
		
		if(result2)
		{
			System.out.println("Contains sub string");
		}
		else
		{
			System.out.println("No Sub String");
		}
	}
}