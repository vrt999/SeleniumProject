package Practice;

class Sample {
	
	public static int i;
	
	public Sample() {
		 i = 3;
	}
	
	public static void getIValue() {
		System.out.println("The I value is: " + i);
	}
	
}
	
	public class SampleConstruct {
		
		public static void main(String[] args) {
			
			Sample.getIValue();
		}
		
	}


