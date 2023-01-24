package demo;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		/*
		 The hiker first enters a valley  units deep. Then they climb out and up onto a mountain  units high. Finally, the hiker returns to sea level and ends the hike.
     Sample Input

      8
       UDDDUDUU
       Sample Output
       1
     Explanation

_/\      _
   \    /
    \/\/
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n :");
		int n = sc.nextInt();
		System.out.println("Enter valley :");
		String st = sc.next();
		System.out.println("Result :"+ValleyCount(n,st));
		
		

	}

	public static int ValleyCount(int n, String st) {
     int alt =0, count=0;
     for(int i = 0; i<n; i++)
     {
    	 char ch = st.charAt(i);
    	
    		if(ch=='U')
    		{
    			alt++;
    			if(alt==0)
    			{
    				count++;
    			}
    		}
    		else 
    		alt--;
    	 }
     
		return count;
	}

}

/*
 output
 
 Enter value for n :
8
Enter valley :
UUDDDDUU
Result :1
*/
