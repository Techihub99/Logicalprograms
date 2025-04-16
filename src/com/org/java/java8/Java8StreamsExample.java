package com.org.java.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Top 25 java 8 coding interview question and Ans.");

		List<Integer> nums = Arrays.asList(10, 12, 22, 5, 100, 13, 55, 53, 22, 10, 1, 2);

		System.out
				.println("1) Given the list of integers, find the first element of the list using Stream functions ?");

		nums.stream().findFirst().ifPresent(System.out::println);

		System.out.println(
				"2) Given a list of integers, find the total number of elements present in the list using Stream functions ?");

		System.out.println(nums.stream().count());

		System.out.println(
				"3) Given a list of integers, find out all the even and odd numbers that exist in the list using Stream functions ?");

		nums.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

		nums.stream().filter(num -> num % 2 != 0).forEach(System.out::println);

		System.out.println(
				"4) Given a list of integers, find out all the numbers starting with 5 using Stream functions ?");

		nums.stream().filter(num -> num.toString().startsWith("5")).forEach(System.out::println);

		System.out
				.println("5) How to find duplicate elements in a given integers list in java using Stream functions?");

		Set<Integer> temp = new HashSet<>();

		nums.stream().filter(num -> !temp.add(num)).forEach(System.out::println);

		System.out.println(
				"6) Given a list of integers, find the maximum and minimum value element present in it using Stream functions?");

		Optional<Integer> max = nums.stream().max(Integer::compareTo);

		Optional<Integer> min = nums.stream().min(Integer::compareTo);

		System.out.println(max.orElse(null));

		System.out.println(min.orElse(null));

		System.out.println("7). Given a list of integers, sort all the values present in it using Stream functions?");

		nums.stream().sorted().forEach(System.out::println);

		System.out.println(
				"8). Given a list of integers, sort all the values present in it in descending order using Stream functions?");

		nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("9). Check array contain duplicate values or not.");

		int[] numbes = { 1, 2, 4, 5 };

		if (Arrays.stream(numbes).distinct().count() != numbes.length) {
			System.out.println("It contain duplicate value");
		} else {
			System.out.println("It contain unique value");
		}

		System.out
				.println("10). Java 8 program to perform square on list elements and filter numbers greater than 50.");

		nums.stream().map(num -> num * num).filter(num -> num > 50).forEach(System.out::println);

		System.out.println(
				"11). Write a Java 8 program to sort an array and then convert the sorted array into Stream ?");

		Arrays.sort(numbes);

		Arrays.stream(numbes).forEach(System.out::println);

		// Medium Level

		System.out.println("12). How to use map to convert words into Uppercase in Java 8?");

		List<String> words = Arrays.asList("Dev", "Byte", "School", "Dev", "Byte");

		words.stream().map(word -> word.toUpperCase()).forEach(System.out::println);

		System.out.println("13). Write a Program to find the Maximum element in an array?");

		Arrays.stream(numbes).max().ifPresent(System.out::println);

		System.out.println("14). Write a Java 8 program to concatenate two Streams ?");

		Stream<Integer> s1 = Stream.of(1, 2, 3);

		Stream<Integer> s2 = Stream.of(4, 5, 6);

		Stream.concat(s1, s2).forEach(System.out::println);

		System.out.println("15). Write a program in stream to print 10 random.?");

		Random random = new Random();

		Stream.generate(random::nextInt).limit(10).forEach(System.out::println);

		System.out.println("16). Print date and time using java 8 feature ?");

		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println(localDateTime);

		System.out.println("17). Then format it in dd-MM-yyyy format ?");

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println(dateTimeFormatter.format(localDateTime));

		System.out.println("18). How to check if list is empty in Java 8 using Optional, "
				+ "if not null iterate through the list and print the object? ?");
		List<String> list = null;

		Optional<List<String>> optionalList = Optional.ofNullable(list);

		optionalList.ifPresentOrElse(i -> i.stream().forEach(System.out::println),
				() -> System.out.println("the  list is empty."));

		System.out.println("19). Given the array {10, 1, 20, 2, 100, 100, 100},write Java code "
				+ "using Java Streams to determine the number of occurrences of a particular value.");

		int[] values = { 10, 1, 20, 2, 100, 100, 100 };

		int number = 100;

		long result = Arrays.stream(values).filter(value -> value == number).count();

		System.out.println(result);

		System.out.println(
				"20). How to find only duplicate elements with its count from the String ArrayList in Java8 ?");

		Map<String, Long> map = words.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		map.entrySet().stream().filter(m -> m.getValue() > 1)
				.forEach(m -> System.out.println(m.getKey() + " : " + m.getValue()));

		System.out.println("21). Write a Program to give sum of salary of employee.?");

		ArrayList<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee(102, "bnaresh", 35, 55000.0, 967691908, "java"));
		list1.add(new Employee(100, "ajay", 40, 55000.0, 994865235, "sap"));
		list1.add(new Employee(106, "srinu", 36, 45000.0, 895462220, ".net"));
		list1.add(new Employee(104, "yyr", 42, 95000.0, 782622220, "testing"));
		list1.add(new Employee(101, "ajay", 39, 105000.0, 970584628, "aws"));

		System.out.println(list1.stream().mapToDouble(Employee::getSalary).sum());

		System.out.println("22). Write a program to print the count of each character in a String using stream ?");

		String val = "DevByteSchool";

		Map<Character, Long> charCount = val.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(charCount);

		System.out.println(
				"23). How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?");

		Map<String, Double> uniqueEmployee = list1.stream()
				.collect(Collectors.toMap(Employee::getEmpName, Employee::getSalary,
						(existing, replacement) -> existing, () -> new TreeMap<>(Comparator.naturalOrder())));

		System.out.println(uniqueEmployee);

		System.out.println("24). Given a String, find the first non-repeated character in it using Stream functions?");

	}

}
