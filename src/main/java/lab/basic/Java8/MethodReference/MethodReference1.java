package lab.basic.Java8.MethodReference;

public class MethodReference1 {

	public static void main(String[] args) {

		Thread t = new Thread(() -> printMessage());
		t = new Thread(MethodReference1::printMessage);
		t.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}
}
