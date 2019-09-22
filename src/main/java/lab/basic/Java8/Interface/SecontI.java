package lab.basic.Java8.Interface;

public interface SecontI {
	void add();

	default void show() {
		System.out.println("SecondI - Show 1");
	}

	default void show2() {
		System.out.println("SecondI - Show 2");
	}

}
