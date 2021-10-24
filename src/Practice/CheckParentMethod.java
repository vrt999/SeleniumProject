package Practice;

class Parent{
	public void method1() {
		System.out.println("I am method 1");
	}
	public void method2() {
		System.out.println("I am method 2");
	}
}

public class CheckParentMethod extends Parent{
	public static void main(String args[]) {
		CheckParentMethod c = new CheckParentMethod();
		c.method1();
	}

}
