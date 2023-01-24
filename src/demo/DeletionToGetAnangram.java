package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DeletionToGetAnangram {
	/*
	 
	 Enter first String: 
     abcd
     Enter Second String: 
     abc
     Result: 1
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1 = sc.next();
		System.out.println("Enter Second String: ");
		String s2 = sc.next();
		System.out.println("Result: "+Numberneededtodelete(s1,s2));
		

	}

	public static int Numberneededtodelete(String s1, String s2) {
		int total = 0;
     Map<Character , Integer> count = new HashMap<>();	
     for(char ch : s1.toCharArray())
     {
    	 int c = count.containsKey(ch) ? count.get(ch) : 0 ; count.put(ch, (c+1));
     }
     for(char ch : s2.toCharArray())
     {
    	 int c = count.containsKey(ch) ? count.get(ch) : 0 ; count.put(ch, (c-1));
     }
   List<Integer> list = new ArrayList<>(count.values());
   for(Integer value : list)
   {
	   total =+Math.abs(value);
   }
		return total;
	}

}
