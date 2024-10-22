package test;

import java.util.LinkedList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l = new LinkedList<>();

		int size = l.size();
		
		int mid = size/2;
		
		l.get(mid);
		
		int count = 1;
		for (Integer e : l) {
			count ++;
		}
		
		
		
		
	}

}
