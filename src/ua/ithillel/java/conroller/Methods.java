package ua.ithillel.java.conroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Methods {
	
	public static int countOccurance(List<String> list, String str) {
		Collections.addAll(list);
		int count = Collections.frequency(list, str);
		System.out.println("The word " + str + " is repeated " + count + " times in the list.");
		return count;
	}
	
	public static <T> List<T> toList(T[] arr) {
		List<T> list = new ArrayList<>();
		Collections.addAll(list, arr);
		System.out.println("It was Array " + Arrays.toString(arr));
		System.out.println("Now List " + list);
		
		return list;
	}
	
	public static <E> Set<E> convertListToSet(List<E> list1) {
		System.out.println("List: " + list1);
		Set<E> set = new HashSet<>(list1);
		System.out.println("Set from List: " + set);
		return set;
	}
	
	public static void calcOccurance(List<String> list) {
		Map<String, Long> frequency = list.stream().collect(Collectors.groupingBy
				(Function.identity(), Collectors.counting()));
		frequency.forEach((k, v) -> System.out.println(k + ": " + v));
	}
	
	public static Set<String> findOccurrence(List<String> list) {
		Set<String> set = new HashSet<>();
		for (String s : list) {
			String string = String.format("{name:\"%s\",occurrence:%d} \n", s,
					Collections.frequency(list, s));
			set.add(string);
		}
		System.out.println(set);
		return set;
	}
}

