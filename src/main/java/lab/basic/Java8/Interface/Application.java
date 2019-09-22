package lab.basic.Java8.Interface;

public class Application extends ThirdRule implements FirstI, SecontI {

	@Override
	public void add() {

	}

	// Possible to Override default Method
	@Override
	public void show() {
		System.out.println("***************Child show()***********");
	}

	// If class implements two interface, If Both have same default method,
	// It needs to be override in derived class
	@Override
	public void show2() {

	}

	public static void main(String[] args) {
		FirstI app = new Application();

		// If child class implements 2 Interfaces, which contains same default method
		// In child class we must need to override
		app.show();

		/// If class & interface(Default method) contains same method,
		// Child class will give priority to class method
		app.play();

		//// Static methods are allowed in Java8
		// Create multiple static & default methods in Interface
		FirstI.add1();
	}

}
