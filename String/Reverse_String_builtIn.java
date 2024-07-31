package String;
public class Reverse_String_builtIn {

    public static void main(String[] args) {
        // Input string
        String input = "Pallavi";
        
        // Create a StringBuilder object with the input string
        StringBuilder stringBuilder = new StringBuilder(input);
        
        // Reverse the string using StringBuilder's reverse() method
        String reversedString = stringBuilder.reverse().toString();
        
        // Print the reversed string
        System.out.println("Reversed String: " + reversedString);
    }
}
