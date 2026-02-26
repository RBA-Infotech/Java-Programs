package MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArbitaryObject {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Orange", "Grape", "Fig", "Guava");

		fruits.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);

		List<String> fruitsUpperCase = fruits.stream()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		
		for (String obj : fruitsUpperCase) {
			System.out.println(obj);
		}
	}

}
