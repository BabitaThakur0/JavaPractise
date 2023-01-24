package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class namephoneNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value n :");
	int n = sc.nextInt();
	Map<String, Integer> myMap = new HashMap<String, Integer>();
	for(int i =0;i<n; i++)
	{
		System.out.println("Enter name and phone no :");
		
		String name = sc.nextLine();
		int phoneNo = sc.nextInt();
		myMap.put(name, phoneNo);
	}
	while(sc.hasNext())
	{
		System.out.println("Enter name :");
		String s = sc.next();
		if(myMap.get(s) == null)
		{
			System.out.println("Name not found :");
				
		}
		else 
		{
			System.out.println("s "+s +" :"+myMap.get(s));
		}
	}

	sc.close();
	}

}
