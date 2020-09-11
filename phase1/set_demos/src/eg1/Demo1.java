package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<>();
		hs.add("hello");
		hs.add("hello");
		hs.add("hello");
		hs.add(null);
		hs.add(null);
		hs.add("heyy");
		hs.add("java");
		hs.add("jeee");
		hs.add("jme");
		hs.add("spring");
		System.out.println("hs = "+hs);
		
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hello");
		lhs.add("hello");
		lhs.add("hello");
		lhs.add(null);
		lhs.add(null);
		lhs.add("heyy");
		lhs.add("java");
		lhs.add("jeee");
		lhs.add("jme");
		lhs.add("spring");
		System.out.println("lhs = "+lhs);
		
		
	//	Set<String> ts=new TreeSet<>();// if ascending
		Set<String> ts=new TreeSet<>(Collections.reverseOrder());//if descending
		ts.add("hello");
		ts.add("hello");
		ts.add("hello");
	//	ts.add(null);
	//	ts.add(null);
		ts.add("heyy");
		ts.add("java");
		ts.add("jeee");
		ts.add("jme");
		ts.add("spring");
		ts.add("alpha");
		System.out.println("ts = "+ts);
		
		System.out.println(ts.size());
		System.out.println(ts.contains("jme"));
		System.out.println(ts.contains("jse"));
		ts.remove("jme");
		System.out.println(ts);
		
		//addAll() - union    , retainAll() - intersection, removeAll() - (A-B)
		
		for(String s:ts) {
			System.out.println(s);
		}
		
		//SortedSet set =new TreeSet();
		//NavigableSet set =new TreeSet();

	}

}
