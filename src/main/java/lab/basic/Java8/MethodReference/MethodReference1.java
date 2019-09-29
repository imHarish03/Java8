package lab.basic.Java8.MethodReference;

public class MethodReference1 {

	public static void main(String[] args) {

		Thread t1, t2, t3 = null;
		// Classic
		t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				printMessage();
			}
		});
		t1.start();

		// Lambda
		t2 = new Thread(() -> printMessage());
		t2.start();

		// Method Reference
		t3 = new Thread(MethodReference1::printMessage);
		t3.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}
}
