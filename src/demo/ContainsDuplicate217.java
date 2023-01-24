package demo;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate217 {

	public static void main(String[] args) {
		/*
		 * Given an integer array nums, return true if any value appears at least twice
		 * in the array, and return false if every element is distinct. Example 1:
		 * Input: nums = [1, 2,3,1] Output: true Example 2: Input: nums = [1,2,3,4]
		 * Output: false
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int [] num = new int[n];
		System.out.println("Enter the values:");
		for(int i=0; i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Result: "+containingValue(num));
		
	}

	public static boolean containingValue(int[] num) {
		HashSet<Integer> set = new HashSet<>();
		for(int n : num)
		{
			if(!set.contains(n))
			{
				set.add(n);
				return true;
			}
		}
		return false;
	}
		
}

/*
Enter n:

4
Enter the values:
1
2
3
1
Result: true

*/
