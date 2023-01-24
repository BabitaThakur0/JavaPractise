package demo;

import java.util.Scanner;

public class DiagonalDifference {
	/*
	 Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = 1+5+9. The right to left diagonal = 3+5+9. Their absolute difference is .|15-17| =2
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Etner the number of n:");
		int n = sc.nextInt();
		int[][] arr1 = new int[n][n]; 
		System.out.println("Etner array1 :");
		for(int i = 0; i<n; i++)
		{
		
		for(int j = 0; j<n; j++)
		{
		 arr1[i][j] = sc.nextInt();
		}
	}
		System.out.println("The Result is :" + Diaganal_Difference (arr1));
	}

	public static int Diaganal_Difference(int[][] arr1) {
		int sum = 0;
		int n = arr1.length;
		  
		  int sumL = 0;
		  int sumR = 0;
		  
		  for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		      if (i == j) {
		        sumR += arr1[i][j];
		      } if (i + j == n - 1) {
		        sumL += arr1[i][j];
		      }
		    }
		  }  
		  return Math.abs(sumL - sumR);
		  
		
	}
	

}

/*
output

Etner the number of n:
3
Etner array1 :
1 2 3
4 5 6
9 8 9
The Result is :2

*/