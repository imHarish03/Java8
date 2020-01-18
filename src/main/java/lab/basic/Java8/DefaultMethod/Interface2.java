package lab.basic.Java8.DefaultMethod;

@FunctionalInterface
public interface Interface2 {

	void method2();

	static void log(String str) {
		System.out.println("I2 logging::" + str);
	}
}
