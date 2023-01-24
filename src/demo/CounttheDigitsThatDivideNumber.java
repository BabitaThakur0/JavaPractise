package demo;

import java.util.Scanner;

public class CounttheDigitsThatDivideNumber {
	/*
	 Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.

 

Example 1:

Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
Example 2:

Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
Example 3:

Input: num = 1248
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
	 */

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		System.out.println("Result : "+countDigits(n));
		

	}
	public static int countDigits(int num) {
        int temp = num; int count =0;
        while(temp>0)
        {
            int val = temp%10;
            if(val!=0 && num %val == 0)
            count++;
            temp/=10;
        } 
        return count;
    }

}
/*
 output
 
  Enter the n value
7
Result : 1


Enter the n value
1248
Result : 4


 * */
