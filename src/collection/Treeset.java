package collection;

import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	TreeSet t= new TreeSet();
	t.add("pooja");
	t.add("ashu");
	t.add("kale");
	System.out.println(t);
	System.out.println(t.size());
	System.out.println(t.isEmpty());
	t.pollFirst();
	System.out.println(t);
	t.pollLast();
	System.out.println(t);
	t.add(null);
	}
}
