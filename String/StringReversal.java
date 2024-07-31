package String;
public class StringReversal {

    // Method to reverse a given string
    public static String reverseString(String str) {
        // Initialize an empty string to store the reversed string
        String reversed = "";
        
        // Iterate through the original string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        String input = "Pallavi";
        String reversed = reverseString(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}