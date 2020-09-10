package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		li.add("helllooo");
		li.add("heyyyy");
		li.add(1111);
		li.add(22222.2222);
		li.add(1222333333L);
		li.add(22.9f);
		li.add('c');
		li.add(true);
		
		System.out.println(li);
		
		List<Integer> li1=new LinkedList<>();
		li1.add(1234);
		li1.add(1234);
		li1.add(null);
		li1.add(1231);
		li1.add(null);
		li1.add(1234);
		li1.add(4311);
		li1.add(1212);
		System.out.println("li1 = "+li1);
		
		li1.add(3, 8888);
		System.out.println("li1 = "+li1);
		li1.set(3,9999);
		System.out.println("li1 = "+li1);
		System.out.println(li1.get(5));
		System.out.println(li1.size());
		for (int i = 0; i < li1.size(); i++) {
			System.out.println(li1.get(i));
		}
		li1.remove(4); //primitive - index
		System.out.println("li1 = "+li1);
		Integer i=1234;
		while(li1.remove(i)) {}; //takes object which removes the first occurance of that object
		System.out.println("li1 = "+li1);
		
		//List<Integer> li2=new ArrayList<>(li1);
		//System.out.println("li2 = "+li2);
		List<Integer> li2=new ArrayList<>();
		li2.add(55);
		li2.add(66);
		li2.add(77);
		li2.add(9999);
		System.out.println("li2 = "+li2);
		li2.addAll(li1); //unionAll
		System.out.println("li2 = "+li2);
	//	li2.retainAll(li1); intersection
		li2.removeAll(li1); //li2-li1
		System.out.println("li2 = "+li2);
		
		Collections.reverse(li1);
		System.out.println("li1 = "+li1);
		Collections.shuffle(li1);
		System.out.println("li1 = "+li1);
		Collections.replaceAll(li1, null, 0);
		System.out.println("li1 = "+li1);
		Collections.sort(li1); //ascending
		System.out.println("li1 = "+li1);
		Collections.sort(li1,Collections.reverseOrder()); //descending
		System.out.println("li1 = "+li1);
		Collections.sort(li1); //ascending order sort before performing binarySearch
		System.out.println("li1 = "+li1);
		System.out.println(Collections.binarySearch(li1, 0));
		System.out.println(Collections.binarySearch(li1, 2));
		System.out.println(Collections.binarySearch(li1, 4311));
		
		System.out.println(li1.contains(4311));
		System.out.println(li1.contains(2));
 	}

}
