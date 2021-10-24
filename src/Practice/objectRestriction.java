package Practice;

class Triton{
	private static Triton triinstance = null;
	private static int i;

	private Triton() {
		System.out.println("Hello I am String from Triton");
		i++;
	}
	public static Triton getInstance() {
		if(i < 3) {
			triinstance = new Triton();
		}
		return triinstance;
	}
}

public class objectRestriction {

	public static void main(String[] args) {
		Triton t1 = Triton.getInstance();
		Triton t2 = Triton.getInstance();
		Triton t3 = Triton.getInstance();
		Triton t4 = Triton.getInstance();
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		System.out.println(t4.hashCode());

	}

}
