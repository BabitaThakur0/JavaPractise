package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {
	/*
	 You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
Example
Candles =[4,4,1,3]
The maximum height candles are 4 units high There are 2  of them, so return 2 .
Sample Input 0

4
3 2 1 3
Sample Output 0

2



	 */

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n value");
	int n = sc.nextInt();
	List<Integer> value = new ArrayList<Integer>();
	System.out.println("Enter Values : ");
	
	for(int i=0;i<n;i++)
	{
		value.add(i);
		
	}
	System.out.println("Result : "+birthdayCakeCandles(value));
	}

	public static int birthdayCakeCandles(List<Integer> candles)
	{
		int candlecount = 0;
		Collections.sort(candles);
		int maxValue = candles.get(candles.size()-1);
		System.out.println("maxValue : "+maxValue);
		for(int n : candles)
		{
			if(n == maxValue)
			{
				candlecount+=1;
			}
		}
		
		
		
		return candlecount;
}
}

/*
 output
 
  Enter the n value
4
Enter Values : 
4
4
1
3
Result : -2

 */
