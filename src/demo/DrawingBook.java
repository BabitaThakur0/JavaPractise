package demo;

import java.util.Scanner;
/*
When they flip page 1 they see pages 2  and 3. Each page except the last page will always be 
printed on both sides. The last page may only be printed on the front, given the length of the book. If the book is n
pages long, and a student wants to turn to page , what is the minimum number of pages p to turn? They can start at the beginning or the end of the book.
 
 *Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page ./
 *
 *n=6
 *p=2
 *ans+1
 **/
public class DrawingBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s :");
		int n = sc.nextInt();
		System.out.println("Enter t :");
		int p = sc.nextInt();
		System.out.println("Result : "+pageCount(n,p));
		
	}
	public static int pageCount(int n, int p) {
	    int df =p/2;
	    int de = n/2;
	    return Math.min(df,(de-df));
	}

}
/*
 output
 
 Enter s :
6
Enter t :
2
Result : 1

 * */
