package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(6);

		List<Integer> output = list.stream().filter(n -> n % 2 == 0).sorted((a,b)->b-a).collect(Collectors.toList());
		
//		output.sort(Collections.reverseOrder());
		
		System.out.println(output);
			
		int sum = IntStream.range(1, 11).map(n->n*n).reduce((a,b) -> Integer.sum(a,b)).getAsInt();
		
		System.out.println(sum);

	}

}
