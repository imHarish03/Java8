package lab.basic.Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamWithForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 5; i++) {
			list.add(i);
		}

		Consumer<Integer> c = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		System.out.println("** Consumer Interface - Simple  Annonymous Inner Class ** ");
		list.forEach(c);

		System.out.println("**** Lambda With Annonymous Inner Class****");
		Consumer<Integer> cs = (Integer i) -> {
			System.out.println(i);
		};
		list.forEach(cs);

		// Java Stream
		System.out.println("*****Stream with Lambda****");
		list.forEach(i -> {
			System.out.println(i);
		});

	}
}
