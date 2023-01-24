package demo;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		System.out.println("Result :"+palidromvalue(n));
		
		

	}

	public static boolean palidromvalue(int n) {
		
		if(n<0)
			return false;
		if(n==0)
			return true;
		int temp =0;
		int x = n;
		while(x>0)
		{
		temp = (temp*10)+(x%10);
		x= n/10;
	}
		return temp==x;
	}

}
