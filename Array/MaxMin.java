package Array;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        // Example array
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter array size:");
    	int n= sc.nextInt();
    	int numbers[]= new int[n];
    	
    	System.out.println("Enter Array Elements:");
    	for(int i=0; i<n; i++)
    	{
    		numbers[i] = sc.nextInt();
    	}
        

        // Initialize min and max with the first element of the array
        int min = numbers[0];
        int max = numbers[0];

        // Iterate through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Output the results
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
