package ua.ithillel.java;

import java.util.ArrayList;
import java.util.List;
import ua.ithillel.java.conroller.Methods;

public class Main extends Methods {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("banana");
		list.add("kiwi");
		list.add("watermelon");
		list.add("kiwi");
		list.add("tomato");
		list.add("watermelon");
		list.add("banana");
		list.add("pineapple");
		list.add("banana");
		list.add("pineapple");
		list.add("watermelon");
		list.add("banana");
		list.add("banana");
		list.add("pineapple");
		list.add("tomato");
		
		System.out.println("Method - CountOccurance");
		countOccurance(list, "banana");
		System.out.println("\n");
		System.out.println("Method - CalcOccurance");
		calcOccurance(list);
		System.out.println("\n");
		System.out.println("Method - ConvertListToSet");
		convertListToSet(list);
		System.out.println("\n");
		Integer[] arr = new Integer[]{1, 6, 2, 8, 4, 9, 3, 6, 8, 12, 13, 8, 11};
		System.out.println("Method - ToList");
		toList(arr);
		System.out.println("\n");
		System.out.println("Method - FindOccurrence");
		findOccurrence(list);
	}
	
}