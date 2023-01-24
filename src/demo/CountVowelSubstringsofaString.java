package demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountVowelSubstringsofaString {
	
	/*
	 substrinq is a contiguous (non-empty) sequence of characters within a string. 
	 A vowel substring is a substring that only consists of vowels ( 'a', 'e', 'i', 'o' and 'u') and has all
     vowels present in it.
       Given a string word, return the number of vowel substrings in word
       Example 1:
       Input: word = "aeiouu"
       Explanation: the vowel substrings of word are as follows underlined:
       "aeiouu" aeiouu"

	 */

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
				System.out.println( "Enter First word");
				String word = in.nextLine( );
				System.out. println( "Vowels--->"+countVowelSubstrings(word));
	}

	public static int countVowelSubstrings(String word) {
		int n = word.length();
		Set<Character> set = new HashSet<>();
		int vowels = 0;
		for(int i = 0; i<n-4; i++)
		{
			set.clear();
			for(int j= i; j<n; j++)
			{
				char ch = word.charAt(j);
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
				set.add(ch);	
				
				if(set.size()==5)
				
					vowels++;
				}
				else 
					break;
				
			}
			
		}
		
		
	
		return vowels;

	}
}
