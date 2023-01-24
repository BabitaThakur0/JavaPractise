package demo;

import java.util.Scanner;

public class BeautifulDaysattheMovies {

	/*
	 Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number  12
	 its reverse is 21. Their difference is 9. The number 120 reversed is 21, and their difference is 99 .
	 She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.
	 int i: the starting day number
     int j: the ending day number
     int k: the divisor
     input
     20 23 6
     output
     2
     
    1. Day 20 is beautiful because the following evaluates to a whole number: (20-2)/6=3
    2. Day 21 is not beautiful because the following doesn't evaluate to a whole number:(21-12)/6=1.5

     
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the n value");
		int x = sc.nextInt();
		System.out.println("Enter the n value");
		int y = sc.nextInt();
		System.out.println("Enter the n value");
		int z = sc.nextInt();
		
		System.out.println("Result : "+beautifulDays(x,y,z));
		
	}

	
public static int beautifulDays(int i, int j, int k) {
	int count =0;
	for(int a=i; a<=j; a++)
	{
		int num = a;
		int rev = 0;
		while(num != 0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		int diff = Math.abs(a-rev);
		if(diff%k == 0)
		{
			count++;
		}
		
	}
	return count;
}
}

/*
 
 output
 
 Enter the n value
20
Enter the n value
23
Enter the n value
6
Result : 2

 
 
 
 * */
