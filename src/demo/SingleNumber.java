package demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SingleNumber {
	
	/*
	 Given a non-empty array of integers nums, every element appears twice except for one. 
	 Find that single one.
     You must implement a solution with a linear runtime complexity and use only 
     constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1

	 */

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		System.out.println("Enter values :");
		
		int[] value = new int[n];
		for(int i=0;i<n;i++)
		{
			value[i]= sc.nextInt();
			
		}
		System.out.println("Result: "+singleNumber (value));

	}

	public static int singleNumber(int[] value) {
		Set<Integer> set = new HashSet<Integer>();
		for(int num : value)
		{
			if(set.contains(num))
			{
				set.remove(num);
				
			}
			else
			{
				set.add(num);
				
			}
		}
		
		
		
		
		return set.iterator().next();
	}
	

}
