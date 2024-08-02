package Array;

import java.util.Scanner;

class Sum1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		
		int[] array = new int[n];
		System.out.println("enter array of elements");
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
		}
		int sum = Calculatesum(array);
		System.out.println("The sum of array elements is: " + sum);
		
	}
	public static int Calculatesum(int array[])
	{
		int sum=0;
		for(int i=0; i<array.length; i++)
		{
			sum += array[i]; 
		}
		return sum;
		
	}
}