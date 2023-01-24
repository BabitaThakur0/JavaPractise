package demo;

import java.util.Scanner;

public class AppleandOrange {

	public static void main(String[] args) {
		/*
		 Given the value of d  for m apples and  n oranges, determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range [s,t])?

For example, Sam's house is between s=7 and t=10. The apple tree is located at a=4 and b=12 the
 orange at . There are m=3 apples and n=3 oranges. Apples are thrown 
 apples =[2,3,-4] units distance from a, and  oranges =[3,-2,,-4]units distance. 
 Adding each apple distance to the position of the tree, they land at [4+2,4+3,4+-4] =[6,7,0]
 oranges =[12+3,12+-2,12+-4]=[15,10,8] One apple and two oranges land in the inclusive range 7-10 so we print 1,2 .
 
		  
		 */
		int apple =0, orange =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s :");
		int s = sc.nextInt();
		System.out.println("Enter t :");
		int t = sc.nextInt();
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		System.out.println("Enter n :");
		int n = sc.nextInt();
        System.out.println("Enter apples list : ");
		int[] apples = new int[n];
		for(int i=0;i<n;i++)
		{
			apples[i]= sc.nextInt();
			
		}
		 System.out.println("Enter orangess list : ");
			int[] oranges = new int[n];
			for(int i=0;i<n;i++)
			{
				oranges[i]= sc.nextInt();
				
			}
		
	
	
		for(int i =0; i<apples.length; i++)
		{
			int dis = apples[i]+a;
			if(dis>=s && dis<=t)
			{
				apple++;
				
			}
		}
		for(int i =0; i<oranges.length; i++)
		{
			int dis = oranges[i]+b;
			if(dis>=s && dis<=t)
			{
				orange++;
				
			}
		}
		System.out.println("apple :"+apple +"orange :"+orange);

	}
}
/*
 Enter s :
7
Enter t :
10
Enter a :
4
Enter b :
12
Enter n :
3
Enter apples list : 
2
3
-4
Enter orangess list : 
3
-2
-4
apple :1orange :2

 * */
