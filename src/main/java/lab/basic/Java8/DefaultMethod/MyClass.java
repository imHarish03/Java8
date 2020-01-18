package lab.basic.Java8.DefaultMethod;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	@Override
	public void log(String str) {
		Interface2.log(str);
	}

}
