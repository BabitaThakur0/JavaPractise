package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("Babita");
		ar.add(1);
		ar.add(10.1);
		ar.add(true);
		ar.add("Thakur");
		ar.add(34);
		for (int i = 0; i < ar.size(); i++) {
			// System.out.println("Normal-->"+ar.get(i));

		}
		for (Object ob : ar) {
			// System.out.println("Normal--->"+ob);
		}
		//ar.stream().forEach(ele -> System.out.println(ele));
	
        Iterator<Object> it = ar.iterator();
        while(it.hasNext())
        {
        	//System.out.println("Normal123--->"+it.next());
        }
        //ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
        //System.out.println("list-->"+list);

        
	ArrayList<Object> ar2 = new ArrayList<Object>();
	ar2.add("Welcome");
	ar2.add(2);
	ar.add("India");
	
	ar.addAll(ar2);
	 System.out.println("listtrdv-->"+ar);
	
	}
}
