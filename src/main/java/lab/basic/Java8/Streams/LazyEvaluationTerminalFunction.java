package lab.basic.Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluationTerminalFunction {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4);

		int result = 0;
		for (int i : values) {

			if (i % 2 == 0) {
				result = i * 2;
				break;
			}
		}
		System.out.println(result);

		/// Proof for Lazy evaluation and Terminal function
		System.out.println(values.stream().filter(LazyEvaluationTerminalFunction::isDivisible)
				.map(LazyEvaluationTerminalFunction::mapDouble).findFirst().orElse(0));

		System.out.println(values.stream().filter(i -> i % 2 == 0).map(i -> i * 2).findFirst().orElse(0));
	}

	public static boolean isDivisible(int i) {
		System.out.println("Validate IsDivisible by 2: " + i);
		return i % 2 == 0;
	}

	public static int mapDouble(int i) {
		System.out.println("Double value by 2: " + i);
		return i * 2;
	}
}
