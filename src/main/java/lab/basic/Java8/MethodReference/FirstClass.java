package lab.basic.Java8.MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

interface Parser {
	String parse(String str);
}

class StringParser {

	public static String Convert(String s) {
		if (s.length() < 5) {
			return s.toUpperCase();
		} else {
			return s.toLowerCase();
		}
	}
}

class MyPrinter {
	public void print(String s, Parser p) {
		System.out.println("***Inside Printer class*****");
		s = p.parse(s);
		System.out.println(s);
	}
}

public class FirstClass {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("George", "Hari", "Karupu");
		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};

		// names.forEach(con);

		String str = "Mat";
		MyPrinter print = new MyPrinter();
		System.out.println("Calling print()");
		print.print(str, new Parser() {
			@Override
			public String parse(String str) {
				System.out.println("***************Annonymoue method******************");
				return StringParser.Convert(str);
			}
		});

	}
}
