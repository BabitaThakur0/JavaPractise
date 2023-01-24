package demo;

import java.util.Scanner;

public class CatsandaMouse {
	/*
	 Two cats and a mouse are at various positions on a line. You will be given their starting positions. 
	 Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
	 https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true
	 */

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Cat A value");
		int x = sc.nextInt();
		System.out.println("Enter the Cat B value");
		int y = sc.nextInt();
		System.out.println("Enter the Mouse C value");
		int z= sc.nextInt();
		System.out.println("Result :"+catAndMouse(x,y,z));
		
		

	}
	public static String catAndMouse(int x, int y, int z) {
		String str =" ";
		
		int da = Math.abs(z-x);
		int db = Math.abs(z-y);
		if(da<db)
			str = "Cat A";
		else
			if(db<da)
				str = "Cat B";
			else 
				str = "Mouse C";
			
		return str;
	}
	    

}

/*
 output
 
 Enter the Cat A value
1
Enter the Cat B value
2
Enter the Mouse C value
3
Result :Cat B

 */
