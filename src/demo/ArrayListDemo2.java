package demo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("Babita");
		ar.add(1);
		ar.add(10.1);
		ar.add(true);
		ar.add("Thakur");
		ar.add(34);
		ArrayList<Object> ar2 = new ArrayList<Object>();
		ar2.add("Welcome");
		ar2.add(2);
		ar2.add("India");
		
		//ar.addAll(ar2);
		@SuppressWarnings("unchecked")
		ArrayList<Object> ar3 = (ArrayList<Object>)ar.clone();
		 System.out.println("listtrdv-->"+ar3);
			
	}

}
