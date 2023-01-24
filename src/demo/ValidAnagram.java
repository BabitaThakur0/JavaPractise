package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
	/*
	 Given two strings s and t, return true if t is an anagram of s. and false otherwise
      An Anacram is a word or phrase tormed ov rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
   
    Exam1:
     Input: S = "anagram", t = "margana"
     Output: true
     
     exam2:
     Input: s = "rat" t = "car" 
     Output: false
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firt String :");
		String s1 = sc.nextLine();
		System.out.println("Enter second String :");
		String s2 = sc.nextLine();
		System.out.println("Result :"+isAnagran(s1,s2));
		
		

	}

	public static boolean isAnagran(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
         s1 = new String(ch1);
         s2 = new String(ch2);
         
         if(s1.equals(s2))
         {
        	 return true;
         }
 		
		
		return false;
	}

}

/*
 
Enter firt String :
anagram
Enter second String :
margana
Result :true
*/

