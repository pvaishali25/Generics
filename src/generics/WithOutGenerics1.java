package generics;

import java.util.ArrayList;  //without generics example
import java.util.Iterator;

public class WithOutGenerics1 {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(5);
		
		System.out.println(al);
		Iterator iterator = al.iterator();
		
		while(iterator.hasNext()) {
			Integer next = (Integer) iterator.next();
			System.out.println(next);
		}
	}

}
