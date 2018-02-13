package com.programming.challange;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedWords {
	
	public static void topFiverepeated() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("AAA");
		list.add("AAA");
		list.add("BBB");
		list.add("BBB");
		list.add("BBB");
		list.add("CC");
		list.add("CC");
		list.add("XXX");
		list.add("XXX");
		list.add("PP");
		list.add("QQ");
		list.add("XXX");
		list.add("XXX");
		
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

		List<Map.Entry<String, Long>> sortedList = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(5)
				.collect(Collectors.toList());
		
		for (int i = 0; i < sortedList.size(); i++) {
			System.out.println(sortedList.get(i));
		}
	}

	public static void main(String[] args) {
		topFiverepeated();

	}

}


