package String;

import java.util.*;   
class Palindrome 
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a stringto check if it is a palindrome");  
      original = in.nextLine();  
      
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("  palindrome.");  
      else  
         System.out.println(" isn't a palindrome.");   
   }  
}  