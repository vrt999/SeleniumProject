package Practice;

public class StaticVariable {

		    private static float temp() 
		    { 
//		        public static float sum = 21; uncommneting this gives compilation error as sum decared static inside a method
//		        return(--(sum)); 
		    	return 0;
		    } 
		    public static void main(String[] args)
		    { 
		    	StaticVariable test = new StaticVariable(); 
		        System.out.println(test.temp()); 
		    } 
		}  
