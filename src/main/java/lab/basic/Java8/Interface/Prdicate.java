package lab.basic.Java8.Interface;

import java.util.Arrays;
import java.util.List;

public class Prdicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		int a = list.stream().filter(i -> i % 2 == 0)// filter the N.o divided by 2
				.map(i -> i * 2)// Multiply each no by 2
				.reduce(0, (c, e) -> c + e); // Sum

		System.out.println(a);
	}
}
