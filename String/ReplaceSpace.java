package String;

public class ReplaceSpace {
	
	public static void main(String[] args) 
	{
        String str = "Hello World! This is a test.";
        char replacement = '-';
        String result = replaceSpaces(str, replacement);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result);
    }
	
    public static String replaceSpaces(String str, char replacement) 
    {
        if (str == null) 
        {
            return null;
        }

        // Convert the string to a char array to modify it
        char[] charArray = str.toCharArray();
        int length = charArray.length;

        // Iterate through the char array and replace spaces
        for (int i = 0; i < length; i++) 
        {
            if (charArray[i] == ' ') 
            {
                charArray[i] = replacement;
            }
        }

        // Convert the modified char array back to a string
        return new String(charArray);
    }

    
}