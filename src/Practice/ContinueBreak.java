package Practice;

public class ContinueBreak {

	public static void main(String[] args) {
		int i;
		for(i=0;i<=5;i++) {
			if(i%2==0) {
				System.out.println("In if loop: i = " + i );
				break;
				}
			else 
			System.out.println("In else loop: i = " + i);
			
		}

	}

}
