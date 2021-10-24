class Parent {
	
	public Parent() {
		System.out.println(" I am parent constructor");
//		int c = 4;
	}
	static int a;
	static int b = 3;
	
	int c = 4;
	
	public void method1() {
		System.out.println("I am method1");
	}
}



public class ChildClass extends Parent{
	
	ChildClass(){
		System.out.println("I am child class constructor");
	}
	int b = 6;
//	int c = 3;
	
	
	public void method2() {
		
		System.out.println("I am method2");
		method1();
		
	}
	
	public static void main(String[] args) {
		 int c = 7;
		ChildClass x = new ChildClass();
		x.method1();
		x.method2();
		System.out.println("The value of child parent c from child ref: " + x.c);
		
		System.out.println("The value of child parent c from child ref: " + c);
/*		Parent p = new Parent();
		System.out.println("The value of  parent a: " + Parent.a);
		System.out.println("The value of child b: " + x.b);
		System.out.println(" The value of parent c: " + p.c);
		System.out.println(" The value of local c: " + c);*/
	}

}
