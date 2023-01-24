package demo;

import java.util.Scanner;

public class RotateString {
	/*
	 
     Given two strinas s and goal, return true if and only if s can become goal after some number of shifts on s.
     A shift on s consists of moving the leftmost character of s to the rightmost position.
     For example, if s = "abode", then it will be "bedea" after one shift.
      
      Example 1:
      Input:
      s = "abode", goal = "cdeab"
      Output: true

      Example 2:
      Input: s = "abode", goal = "abced"
      Output: false 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String :");
		String s1 = sc.nextLine();
		System.out.println("Enter second String :");
		String s2 = sc.nextLine();
		System.out.println("Result :"+(rotateString(s1,s2)));
		

		
	}

	public static boolean rotateString(String s1, String s2) {
		
		String res = s2+s2;
		System.out.println("res : "+res);
		if(s1.length()==s2.length())
		{
			if(res.contains(s2))
			{
				
				return true;
				
			}
			else 
				return false;
		}
		return false;
	}

}

/*
 output 
 
 Enter first String :
abdcfe
Enter second String :
abcdef
Result :true

 */

