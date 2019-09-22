package lab.basic.Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class BIFunctionInterface {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> s = list.stream();

		/*
		 * Represents an operation upon two operands of the same type, producing a
		 * result of the same type as the operands. This is a specialization of {@link
		 * BiFunction} for the case where the operands and the result are all of the
		 * same type
		 */
		Function<Integer, Integer> ft = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * 2;
			}
		};
		s = s.map(ft);

		/*
		 * Represents an operation upon two operands of the same type, producing a
		 * result of the same type as the operands. This is a specialization of {@link
		 * BiFunction} for the case where the operands and the result are all of the
		 * same type.
		 */
		BinaryOperator<Integer> binary = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		//
		Optional<Integer> result = s.reduce(binary);
		System.out.println(result.get());

		/// Stream API direct
		int out = list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e);
		System.out.println(out);
	}
}
