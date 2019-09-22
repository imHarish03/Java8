package lab.basic.Java8.Interface;

public interface FirstI {
	void add();

	default void show() {

	}

	default void play() {
		System.out.println("Call play() from FirstI");
	}

	static void add1() {
		System.out.println("***************Static add method**************");
	}

}
