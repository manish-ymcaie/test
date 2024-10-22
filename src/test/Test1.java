package test;

import java.util.LinkedHashSet;

public class Test1 {

	LinkedHashSet<Integer> l = new LinkedHashSet<>();
	int limit = 5;

	Integer refer() {
		
		int ele=l.iterator().next();

		l.remove(ele);
		l.add(ele);
		return ele;

	}

	void put(Integer i) {

		if (l.size() == limit) {

			int ele=l.iterator().next();

			l.remove(ele);

		} 
		l.add(i);

	}

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.put(3);

		t.put(4);
		

		System.out.print(t.refer());

		System.out.print(t.refer());

		System.out.print(t.refer());

		t.put(5);
		System.out.print(t.refer());

		System.out.print(t.refer());

		System.out.print(t.refer());
		System.out.print(t.refer());

		System.out.print(t.refer());

		t.put(5);
		System.out.print(t.refer());

	}

}
