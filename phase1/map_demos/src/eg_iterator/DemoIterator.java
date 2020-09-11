package eg_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoIterator {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(122, "java");
		map.put(102, "html");
		map.put(120, "css");
		map.put(222, "bootstrap");
		map.put(400, "jse");
		map.put(444, "ejb");
		map.put(224, "hibernate");
		map.put(200, "spring");
		map.put(144, "kubernetes");
		System.out.println("map before deletion ");
		System.out.println(map);
		
//		for(Entry<Integer, String > e: map.entrySet()) {
//			if(e.getKey()%4==0) {
//				map.remove(e.getKey());
//			}
//		}
		
		Iterator<Entry<Integer, String>> i=map.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer, String > e=i.next();
			if(e.getKey()%4==0) {
				i.remove();
			}
		}
		
		//Enumerator -> read from top to bottom
		//Iterator -> read and remove from top to bottom
		//ListIterator -> add,read,remove and is bidirectional but applicable only on List
		System.out.println("map after deletion ");
		System.out.println(map);
		
		

	}

}
