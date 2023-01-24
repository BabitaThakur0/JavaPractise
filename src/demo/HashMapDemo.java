package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("ab", "Babita");
		map.put("cd", "Ram");
		map.put("ef", "Sita");
		map.put("gh", "git");
		map.put("ij", null);
		map.put("kl", null);
		map.put(null, "John");
		//map.put(null, "merry"); not possible to have more null keys;
		/*Iterator<String> it = map.keySet().iterator();
		while(it.hasNext())
		{
		String key = it.next();
		String value = map.get(key);
		System.out.println(key+ "=="+ value);
		}
	
		
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String, String> iter = itr.next();
			System.out.println(iter.getKey()+ "=="+iter.getValue());
			
		}
			*/
		map.forEach((k,v) -> System.out.println(k + "==" + v));

	}

}
