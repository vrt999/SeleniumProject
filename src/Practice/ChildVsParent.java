package Practice;


class Father {
	int iParent = 5;
	
	public void testParent() {
		System.out.println("The sample method from parent");
	}
	
}

public class ChildVsParent extends Father {

	public static void main(String[] args) {
		
		ChildVsParent c = new ChildVsParent();
	
		System.out.println("The value of i: " + c.iParent);
		c.testChild();

	}
	
	public void testChild() {
		System.out.println(" The variable from parent : " + iParent);
	}
//	Note: If we make both A.fun() and B.fun() as non-static then the above program would print “B.fun()”. 
//	While both methods are static types, the variable type decides the method being invoked, not the assigned object type
	
	//Method Overidding drives on object reference for static methods
	//where as for non static methods it is driven on the object created
/*	Parent a = new Child(); //if it is static method overide this executes the parent static method else it executes the child method
	Parent a = new Parent();//this executes only Parent method whether its static or non static
	Child a = new Child();//this executes only Child method whether its static or non static
	child a = new Parent();// this gives compile error
*/	
	
	//Overiding methods can only have return types and subtypes of the overidden method
	
	//overloaded methods can have different return types

}
