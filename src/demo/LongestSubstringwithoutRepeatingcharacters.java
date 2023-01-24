package demo;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringwithoutRepeatingcharacters {

	/*
	 Given a string s. find the length of the longest substring without repeating characters
      Example 1:
      Input: S :"abcabcbb"
      Output of 3.
      Explanation: The answer is "abc", with the length
     
     Example 2:
     Inbut: S :"bbbbb"
     Output:1
     Explanation: The answer is "b", with the lenath of

     Example 3:
     Input: ""pwwkew""
      Output:
      Explanation: The answer is "wke", with the length of 3.
     Notice that the answer must be a substring, "pwke"

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s1 = sc.nextLine();
		System.out.println("Result :"+lenathOfLongestSubstring(s1));
		
	}

	public static int lenathOfLongestSubstring(String s1) {
		int max = 0;
		int i=0;
		int j=0;
		HashSet<Character> set = new HashSet<Character>();
		while(i<s1.length())
		{
			if(!set.contains(s1.charAt(i)))
			{
				set.add(s1.charAt(i));
				max= Math.max(max,set.size());
				i++;
				
			}
			else
			{
				set.remove(s1.charAt(j));
				j++;
			}
		}
		return max;
	}

}
/*
 output
 Enter String :
abcabcbb
Result :3

Enter String :
bbbbb
Result :1

 */






















