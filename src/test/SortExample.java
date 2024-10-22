package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Sorting Question: Sort Caps and Smalls internally
		/*
		 * input: SortStringProGraM output: GagiMnoorrPrrSttS
		 */

		String str = "SortStringProGraM";

		StringBuilder out = new StringBuilder();

		List<Integer> l = str.chars().boxed().filter(c -> c.intValue() >= 65 && c.intValue() <= 90)
				.collect(Collectors.toList());

		Map<Integer, Integer> map = new HashMap<>();
		

//		l.stream().forEach(c -> map.put(str.indexOf(c), c));
		Integer index = -1;
		 Integer newindex  =-1;
		for (Integer c : l) {
			index = str.indexOf(c);
			while (index >= 0) {
				map.put(index, c);
				System.out.println(index);
				newindex = str.indexOf(c, index + 1);
				if(newindex >=0) {
					index =  newindex+ index;
				}else {
					break;
				}
			}
		}

		List<Map.Entry<Integer, Integer>> ent = (List<Map.Entry<Integer, Integer>>) map.entrySet().stream()
				.sorted((a, b) -> a.getValue() - b.getValue()).collect(Collectors.toList());

		String work = new String(str);

		str.chars().boxed().forEach(s -> {
			if (!map.values().contains(s)) {
				out.append((char) s.intValue());
			}

		});

		System.out.println(out.toString());
		char array[] = out.toString().toCharArray();

		// now sort the array using array.sort() method
		// without passing any comparetor (natual order)

		Arrays.sort(array);
		// making the string from the array
		String sourtedStr = new String(array);
		// List<Integer> sourtedStr =
		// out.toString().chars().sorted().collect(Collectors.joining());
		StringBuilder finalout = new StringBuilder();
		int j = 0;
		for (int i = 0; i < str.length(); i++) {

			boolean flag = false;
			for (Map.Entry<Integer, Integer> e : ent) {
				if (e.getKey() == i) {
					finalout.append((char) ent.get(j).getValue().intValue());
					flag = true;
					j++;
				}
			}

			if (!flag) {
				System.out.println(i);
				finalout.append(sourtedStr.charAt(i - j));
			}
		}

		System.out.println(finalout);
	}

}
