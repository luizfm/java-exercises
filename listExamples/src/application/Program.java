package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Marco");
		list.add("Anna");
		list.add("Bob");
		list.add("Alex");
		
		System.out.println("-----------------");
		System.out.println("Original list: ");
		for(String person : list) {
			System.out.println(person);
		}
		
		
		System.out.println("-----------------");
		list.removeIf(person -> person.charAt(0) == 'B');
		for(String person : list) {
			System.out.println(person);
		}
		
		System.out.println("-----------------");
		list.add(2, "Bob");
		for(String person : list) {
			System.out.println(person);
		}
		
		System.out.println("-----------------");
		list.remove("Bob");
		for(String person : list) {
			System.out.println(person);
		}
		
		System.out.println("-----------------");
		System.out.println(list.indexOf("Alex"));
		
		System.out.println("-----------------");
		List<String> filteredList = list.stream().filter(person -> person.charAt(0) == 'A').collect(Collectors.toList());
		for(String person: filteredList) {
			System.out.println(person + " Filtered");
		}
		
		System.out.println("-----------------");
		String firstToMatch = list.stream().filter(person -> person.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(firstToMatch);

	}

}
