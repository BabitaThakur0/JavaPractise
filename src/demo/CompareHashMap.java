package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(2, "B");
		map2.put(1, "A");
		//System.out.println("Result : "+map1.equals(map2));
		
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(4, "D");
		map4.put(3, "C");
		map4.put(2, "B");
		map4.put(1, "A");
		HashSet<Integer> combmap = new HashSet<Integer>(map1.keySet());
		//Remove duplicate from hashmap;
		//Find missing key from hashmap;
		combmap.addAll(map4.keySet());
		System.out.println("Result : "+combmap);
		combmap.removeAll(map1.keySet());
		System.out.println("Result : "+combmap);
	    //compare the hasmap by value;
		
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		//System.out.println("Result : "+map1.equals(map2));
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(1, "A");
		map6.put(2, "B");
		map6.put(3, "C");
		
		System.out.println("Result : "+new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		
		
		
	
		
	
		
	
	}

}
