package lab.basic.Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		//System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));

		Object[] objArrayOfIntArrays1 = new Object[] { new int[] { 1, 2 }, // add 2
				new int[] { 1, 2 }, // add 2
				new int[] { 3, 2 }, // query freq 2
				new int[] { 2, 2 }, // delete 2
				new int[] { 3, 2 }, // query freq 2
		};

		List<List<Integer>> primitiveList = Arrays.stream(objArrayOfIntArrays1).map(q -> {
			return Arrays.stream((int[]) q).boxed().collect(Collectors.toList());
		}).collect(Collectors.toList());

		System.out.println(primitiveList);

	}
}
