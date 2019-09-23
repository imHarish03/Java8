package lab.basic.Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollections {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);

		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list2.add(i);
		}
		Stream<Integer> stream2 = list.stream();
		Integer[] evenNumbersArr = stream2.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);
	}
}
