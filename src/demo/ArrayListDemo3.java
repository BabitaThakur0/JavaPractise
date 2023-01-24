package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17));
		ArrayList<Integer> sublist = new ArrayList<Integer>(list.subList(4, 8));
		//System.out.println("sublist--->"+sublist);

		list.removeIf(num->num%2 ==0);
		//System.out.println("list--->"+list);

		ArrayList<String> listvalue = new ArrayList<String>(Arrays.asList("neha","stiv","tom","tom","tom"));
		//listvalue.retainAll(Collections.singleton("tom"));
		
		//System.out.println("singleTon--->"+listvalue);
		Object arr[] = listvalue.toArray();
		for(Object value : arr)
		{
			System.out.println("value--->"+value.toString());
		}
		
	}

}
