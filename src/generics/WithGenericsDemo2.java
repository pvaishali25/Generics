package generics;

import java.util.ArrayList;

public class WithGenericsDemo2 {
	
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(55);
		al.add(66);
		al.add(77);
		System.out.println(al);

		Integer integer = al.get(0);
		System.out.println(integer);

	}
}
