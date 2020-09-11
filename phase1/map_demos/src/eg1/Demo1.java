package eg1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<>();
		hm.put(121, "hello");
		hm.put(121, "hello");
		hm.put(121, "updated");
		hm.put(101, "hello");
		hm.put(141, "hello");
		hm.put(999, null);
		hm.put(null, "hello");
		hm.put(null, null);
		hm.put(180, null);
		hm.put(171, "jse");
		hm.put(144, "oops");
		System.out.println(hm);
		
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(121, "hello");
		lhm.put(121, "hello");
		lhm.put(121, "updated");
		lhm.put(101, "hello");
		lhm.put(141, "hello");
		lhm.put(999, null);
		lhm.put(null, "hello");
		lhm.put(null, null);
		lhm.put(180, null);
		lhm.put(171, "jse");
		lhm.put(144, "oops");
		System.out.println(lhm);
		
		
		Map<Integer, String> tm=new TreeMap<>();
		tm.put(121, "hello");
		tm.put(121, "hello");
		tm.put(121, "updated");
		tm.put(101, "hello");
		tm.put(141, "hello");
		tm.put(999, null);
		//tm.put(null, "hello");
		//tm.put(null, null);
		tm.put(180, null);
		tm.put(171, "jse");
		tm.put(144, "oops");
		System.out.println(tm);
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(121, "hello");
		ht.put(121, "hello");
		ht.put(121, "updated");
		ht.put(101, "hello");
		ht.put(141, "hello");
//		ht.put(999, null);
//		ht.put(null, "hello");
//		ht.put(null, null);
//		ht.put(180, null);
		ht.put(171, "jse");
		ht.put(144, "oops");
		System.out.println(ht);
		
		System.out.println(ht.size());
		System.out.println(ht.containsKey(888));
		System.out.println(ht.containsValue("jse"));
		System.out.println(ht.get(8191));
		System.out.println(ht.get(144));
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		Set<Integer> set=ht.keySet();
		System.out.println("Iterating using keySet()");
		for(Integer i:set) {
			System.out.println("Key = "+i+" Value = "+ht.get(i));
		}
		
		System.out.println("\nIterating using entrySet()");
		for(Entry<Integer, String>e:ht.entrySet()) {
			System.out.println("Key -> "+e.getKey()+" Value -> "+e.getValue());
		}
		
		ht.remove(144);
		System.out.println(ht);
		

	}

}
