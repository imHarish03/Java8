package lab.basic.Java8.StringArray;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class First {
	public static void main(String[] args) {
		String joinedString = String.join(", ", "How", "To", "Do", "In", "Java");
		System.out.println(joinedString);

		List<String> strList = Arrays.asList("How", "To", "Do", "In", "Java");
		String joinedListString = String.join(", ", strList);

		System.out.println(joinedListString);

		// Java8

		String[] strArray = { "How", "To", "Do", "In", "Java" };
		String joinedString8 = String.join(", ", strArray);

		System.out.println(joinedString8);

		StringJoiner joiner = new StringJoiner(", ", "[", "]");

		joiner.add("How").add("To").add("Do").add("In").add("Java");
		System.out.println(joiner);
	}
}
