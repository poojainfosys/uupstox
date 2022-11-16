package collection;

import java.util.ArrayList;

public class Arraylist {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add("pooja");
	a.add(100);
	a.add('a');
	a.add(null);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.isEmpty());
	a.add(3500);
	System.out.println(a);
	a.remove(1);
	System.out.println(a);
	
}
}
