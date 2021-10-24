package Practice;

import java.util.ArrayList;
import java.util.List;

public class FinalVariable {
	static final int i=0;//variable declared as static final should be initialised else throws compiler error
	final int MAXIMUM;
	final double PI;

	// It is possible to initialize a blank final variable in a constructor
	public FinalVariable(int max) {
		MAXIMUM = max;
		PI = 3.14;// throws compile error if any one of them is not assigned a value
	}

	public FinalVariable(double pi) {
		PI = pi;
		MAXIMUM = 5;// throws compile error if any one of them is not assigned a value
	}

	public static void main(String[] args) {
		FinalVariable t1 = new FinalVariable(1500);
		FinalVariable t2 = new FinalVariable(3.145);

		System.out.println("MAXIMUM : " + t1.MAXIMUM + " PI : " + t2.PI);
	}

	public void method1() {
		int arr[] = { 1, 2, 3 };

		// final with for-each statement
		for (final int i : arr) // no error as it is actually getting re-declared after each iteration
			System.out.print(i + " ");
	}

	public void method2() {
		final StringBuilder sb = new StringBuilder("Geeks");
		// This property of final is called non-transitivity.
		sb.append("ForGeeks"); // this is ok as the state of the object is changing but not the reference assignment
		// sb = new StringBuilder("forgeeks"); - throws compiler error;
		StringBuilder sb1 = new StringBuilder("nongeeks");
		// sb = sb1; - throws compiler error as sb is a final reference
		System.out.println(sb);
		
		final List<String> l = new ArrayList<String>();
		l.add("Ravi");
		l.remove(0);
		l.addAll(new ArrayList<String>());
		
	}
}
