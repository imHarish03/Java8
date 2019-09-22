package lab.basic.Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {
		// Stream.of(val1, val2, val3….)
		System.out.println("***Stream.of(val1, val2, val3….)");
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		// Stream.of(arrayOfElements)
		System.out.println("***Stream.of(arrayOfElements)");
		Stream<Integer> stream2 = Stream.of(new Integer[] { 1, 2, 3, 4, 5 });
		stream2.forEach(p -> System.out.println(p));

		// List.stream()
		System.out.println("***List.stream()");
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream3 = list.stream();
		stream3.forEach(p -> System.out.println(p));
	}
}
