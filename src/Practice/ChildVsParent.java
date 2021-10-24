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

}
