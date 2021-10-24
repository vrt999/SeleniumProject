package Practice;

class A {
	public A() {
		System.out.println("I am A's constructor");
	}
	public void check() {
		System.out.println("I am A's method");
	}
}

class B extends A{
	public B() {
		C c = new C();
		System.out.println("I am B's constructor");
	}
	@Override
	public void check() {
		System.out.println("I am B's method");
	}
}

class C extends A{
	public C() {
		System.out.println("I am C's constructor");
	}
	@Override
	public void check() {
		System.out.println("I am C's method");
	}
}

public class IntCheck {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
//		b = c;// errror reference c can't stored in b as the type of b isnot related to C at all
		
		b.check();

	}

}
