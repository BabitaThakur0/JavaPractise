package demo;

public class ReverseVowelsofaString {
	/*
	 
     Given a string s, reverse only all the vowels in the string and return it.
     the vowels are 'a','e','i','o','u';
     they can appear in both cases 

    Example 1:
    Input: s = "hello"
    Output: "holle"
  
     Example 2:
     Input: S = 'leetcode"
      Output: 'leotcede'
	 */

	public static void main(String[] args) {
		String str = "leetcode";
		System.out.println("string---->"+reverseVowels(str));

	}
	public static String reverseVowels(String s) 
	{
		char[] ch = s.toCharArray();
		int i=0;
		char temp;
		int j= ch.length-1;
		while(i<j)
		{
			if(!isVowel(ch[i]))
			
				i++;
			
			else if(!isVowel(ch[j]))
			
				j--;
			
			else 
			{
				temp =ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
		}
		return String.valueOf(ch);

		
		
	}
	private static boolean isVowel(char c) {
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			
			return true;
			
		
		
		default :return false;
		}
	}

}
/* output 
 
string---->holle 
string---->leotcede
 */
