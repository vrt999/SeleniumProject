package Practice;

 class superclass { 
    static void print() 
    { 
        System.out.println("print in superclass."); 
    } 
} 
 public class MethodHiding extends superclass { 
    static  void print() 
    { 
        System.out.println("print in subclass."); 
    } 
    
	public static void main(String[] args) {
        superclass A = new superclass(); 
        superclass B = new MethodHiding(); 
        MethodHiding C = new MethodHiding();
        A.print(); 
        B.print(); 
        C.print();

	}
} 




