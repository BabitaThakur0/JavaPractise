package demo;

import java.util.Scanner;

public class SearchInsertPosition {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		System.out.println("Enter values :");
		
		int[] value = new int[n];
		for(int i=0;i<n;i++)
		{
			value[i]= sc.nextInt();
			
		}
		System.out.println("Enter target :");
		int target = sc.nextInt();
		
		
		System.out.println("Result: "+searchinsert(value, target));

	}

	public static int searchinsert(int[] value, int target) {

		int r= 0;
		int l = value.length-1;
		
		
		while(r<l)
		{
			int mid = (r+l)/2;
			if(value[mid] == target)
			{
				return mid;
			}
			else if(value[mid]>target)
			return r =mid -1;
			
		
		else 
			return l =mid + 1;
	}
		return l;
	}


	

}

/*
 output
 
 Enter the n value
4
Enter values :
1
3
5
6
Enter target :
5
Result: 2

 */

