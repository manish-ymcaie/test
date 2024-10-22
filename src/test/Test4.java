package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a v zz zz";
		
		List<String> list = Arrays.asList(str.split(" "));
		
		 HashMap<String,Long> map = (HashMap<String, Long>) list.stream().collect(Collectors.groupingBy(
                 Function.identity(),
                 Collectors.counting()));
		 
		 list.stream().collect(Collectors.groupingBy(
				 Function.identity(),
		            LinkedHashMap::new, Collectors.counting())).entrySet().forEach(e->System.out.println("word>>"+e.getKey() + " count>>" + e.getValue()));;
		 
		 map.entrySet().stream().forEach(e->System.out.println("11word>>"+e.getKey() + " count>>" + e.getValue()));
		 

	}

}
	