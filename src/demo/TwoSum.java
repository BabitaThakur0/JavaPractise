package demo;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		int[] value = new int[n];
		int target;
		System.out.println("Enter Values : ");
		
		for(int i=0;i<n;i++)
		{
			value[i]= sc.nextInt();
			
		}
		System.out.println("The target value: ");
		target = sc.nextInt();
		/*System.out.println("The values are");
		for(int i=0;i<n;i++)
		{
		System.out.println("value:" +value[i]);
		
		}
		*/
		
		System.out.println("result:" +twoSum(value,target));
     
	}
	   public static int[] twoSum(int[] nums, int target) {
		   
		   for(int i= 0; i<nums.length; i++)
		   {
			   for(int j = 0; j<nums.length;j++)
			   {
				   if(nums[i]+nums[j] == target)
				   {
					   return new int[] {i,j}; 
				   }
			   }
		   }
		   return new int[] {-1};
	   }

}
