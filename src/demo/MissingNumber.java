package demo;

import java.util.Scanner;

public class MissingNumber {
	/*
	Enter the n value
    5
    Enter Values : 
    1
    2
    4
    5
    6
  Result : -3
 
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
		System.out.println("Result : "+MissingValue(value));
		
	}

	public static int MissingValue(int[] value) {
		int sum = 0;
		for(int i=0;i<=value.length;i++)
		{
			sum+=i;
			
		}
		for(int i=0;i<value.length;i++)
		{
			sum-=value[i];
			
		}
		return sum;
	}

}
