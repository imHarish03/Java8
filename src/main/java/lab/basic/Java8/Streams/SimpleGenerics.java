package lab.basic.Java8.Streams;

///Accept its not Java-8
public class SimpleGenerics {
	public static <Ti> void printArray(Ti[] inputArray) {
		// Display array elements
		for (Ti element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		printArray(charArray); // pass a Character array
	}
}
