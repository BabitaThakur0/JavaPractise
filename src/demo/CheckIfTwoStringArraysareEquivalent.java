package demo;

public class CheckIfTwoStringArraysareEquivalent {

	public static void main(String[] args) {
		/*
		 Given two string arrays word and word2,
		 return true if the two arrays represent the same string, and false otherwise.
		 A string is represented by an array if the array elements concatenated in order forms the string.
		 Example 1:
		 Input: wordi = ["ab", "c"], Word2 = ["a", "bc"]
		 Output: true
		 Explanation:
		 wordi represents string "ab" + "c"
		 -> "abe"
		 word2 represents string "a" + "bc"
		 -> "abc"
		 The strings are the same, so return true.
		 Example 2:
		 Input: wordi = ["a",
		 "b"J, word2 = ['ab", "c")
		 Output: false
		 */
		String[] s1 = {"abc","de","f"};
		String[] s2 = {"ab","cde","f"};
		System.out.println("result : "+arrayofStringEqual(s1,s2));
		
		

	}

	public static boolean arrayofStringEqual(String[] s1, String[] s2) {
		String st1=" ";
		String st2=" ";
		for(String a : s1)
		{
			st1+=a;
		}
		for(String b : s2)
		{
			st2+=b;
		}
		if(st1.equals(st2))
		{
		return true;
		}
		else 
			return false;
	}
	
	/*output
	 result : true
	 */

}
