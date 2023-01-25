package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class WithGenerics1 {
public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(5);
		
		System.out.println(al);
		Iterator<Integer> iterator = al.iterator();
		
		while(iterator.hasNext()) {
			Integer next = (Integer) iterator.next();
			System.out.println(next);
		}
}
}