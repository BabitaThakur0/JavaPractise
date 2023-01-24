package demo;

public class countlastChanracterfromString {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("Result "+lengthOfLastword(str));

	}

	public static int lengthOfLastword(String str) {
		int count =0;
	for(int i = str.length()-1;i>=0; i--)
	{
		if(str.charAt(i) != ' ')
		{
			count++;
		}
		else
		
		if(count!=0 && str.charAt(i) == ' ')
		
			break;
		}
	
		
		return count;
	}

}

/*
 output
 
 Result 5
 */

