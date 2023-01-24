package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(4,3,2,1,2,3,2,4,5,6,4,3));
		//HashSet<Integer> set = new HashSet<Integer>(number);
		//System.out.println("Set Value"+set);
		List<Integer> newlist = number.stream().distinct().collect(Collectors.toList());
		Collections.sort(newlist);
		System.out.println("Set Value" + newlist);
		
		
		
	}

}
