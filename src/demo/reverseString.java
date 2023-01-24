package demo;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int i = 0;
		char temp;
		
		int j = ch.length-1;
		while(i<j)
		{
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		String str = new String(ch);
		System.out.println("Result :"+str);
	}
	

}
   /*output

Enter the string :
gfedcba
Result :abcdefg
*/