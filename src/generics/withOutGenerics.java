package generics;

import java.util.ArrayList;

public class withOutGenerics {
	
private static final String Integer = null;

public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	al.add(22);
	al.add(45);
	al.add(10);
	al.add(30);
	al.add(50);
	al.add("Vaishali");
	al.add("Pokharkar");
	
	System.out.println(al);
	
	Integer object1 = (Integer)al.get(0);
	System.out.println(object1);
	
	Integer object2 = (Integer)al.get(3);
	System.out.println(object2);
}

}
