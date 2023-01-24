package demo;

import java.util.Scanner;
/*
 A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a
palindrome, or false otherwise
     
     Example 1:
     Input: S = "A man, a plan, a canal: Panama"
     Output: true
      
      Explanation:
      "amanaplanacanalpanama" is a palindrome
    
    Example 2:
      Input: S = "race a car"
      Output: false
       
      Explanation: "raceacar" is not a palindrome.
  
     Example 3:
    Input:S = Output: true
    Explanation: s is an empty string "" after removing
    non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.

 */
public class isPalimdromOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();
		System.out.println("Result :" + palindromValue(str));

	}

	public static boolean palindromValue(String str) {

		String st = str.toLowerCase().trim();
		StringBuilder sb = new StringBuilder();
		for (char ch : st.toCharArray()) {
			
			if (Character.isDigit(ch) || Character.isLetter(ch)) {
				sb.append(ch);
			}
		}
		int start = 0;
		int end = sb.length()-1;
		while(start<=end)
		{
        if(sb.charAt(start) != sb.charAt(end))
        {
        	return false;
        }
        	start++;
        	end--;
        }
        
		
		return true;
				
		
	}

}

/*out put 
Enter the String :
"A man, a plan, a canal: Panama"
Result :true
*/

