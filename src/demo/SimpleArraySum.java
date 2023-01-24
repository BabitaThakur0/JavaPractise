package demo;

import java.util.Scanner;

public class SimpleArraySum {
	/*
	 Given an array of integers, find the sum of its elements.

     For example, if the array , [1,2,3] =1+2+3 = 6

	 */

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		int[] value = new int[n];
		System.out.println("Enter Values : ");
		
		for(int i=0;i<n;i++)
		{
			value[i]= sc.nextInt();
			
		}
		System.out.println("Result : "+simpleSumofArray(value));
		
	}

	public static int simpleSumofArray(int[] value) {
		int sum=0;
		for(int i : value)
		{
			sum+=i;
			
		}
		return sum;
	}

	}

/*
 output
 Enter the n value
3
Enter Values : 
1
2
3
Result : 6


Enter the n value
6
Enter Values : 
1
2
3
4
10
11
Result : 31

 */


