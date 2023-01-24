package demo;

import java.util.Scanner;

public class CancatnationOftwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value n:");
		int n = sc.nextInt();
		int num[] = new int[n];
		System.out.println("Enter the values:");
		
		for(int i = 0;i<n;i++)
		{
			num[i] = sc.nextInt();
		}
		
		
			System.out.println("Result :"+CancatnatedArray(num));
		
		
		
		
		

	}

	public static int[] CancatnatedArray(int[] nums) {
		
		int[] num = new int[nums.length*2];
	   for(int i = 0; i<nums.length;i++)
	   {
		   num[i] = nums[i];
		   num[i+nums.length]=nums[i];
	   }
		return num;
	}

}
