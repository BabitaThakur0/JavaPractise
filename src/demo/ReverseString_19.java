package demo;

import java.util.Scanner;

public class ReverseString_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		int end = ch.length-1;
		int start = 0;
		char temp;
		while(start<end)
		{
		temp = ch[start];
		ch[start]=ch[end];
		ch[end]=temp;
		start++;
		end--;
		
		}
		System.out.println("Elements = ");
	      for (int i = 0; i < ch.length; i++) 
	         System.out.print(ch[i]);
		
	}
		

	

}
