package demo;

import java.util.Scanner;

public class MaximumCountofPositiveIntegerandNegativeInteger {
	/*
	 Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.

 

Example 1:

Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
Example 2:

Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
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
		System.out.println("Result : "+MaximumCountPosNeg(value));
		

	}

	public static int MaximumCountPosNeg(int[] value) {
		int pos=0;
		int neg =0;
		for(int num : value)
        {
            neg+= num<0 ? 1 : 0;
            pos+= num>0 ? 1 : 0;
            
        }
        return Math.max(pos,neg);
    }

}
/*
 output 
 Enter the n value
6
Enter Values : 
1
2
3
4
5
6
Result : 6


Enter the n value
5
Enter Values : 
-1
-2
-3
4
5
Result : 3

*/

