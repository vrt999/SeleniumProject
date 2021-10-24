package Practice;

class Building  
{ 
	static {
		System.out.println("Parent static block"); 
	}
	 {
		System.out.println("non static parent block"); 
	}
    Building()  
    { 
        System.out.println("Geek-Buiding"); 
    } 
    Building(String name)  
    { 
        this(); 
        System.out.println("Geek-building: String Constructor" + name); 
    } 
} 
public class InheritBlocksConstructor extends Building  
{ 
	InheritBlocksConstructor()  
    { 
        System.out.println("Geek-House "); 
    } 
	InheritBlocksConstructor(String name)  
    { 
		/*Call first goes to the parent no arg cons - second it returns to the arg cons of child 
		- due to this() it will go to the no arg child cons and then the arg cons of child is executed*/
        this(); 
        System.out.println("Geek-house: String Constructor" + name); 
    } 
	
    {
    	System.out.println("Only non static print statement is shown");
    	
    }
    //all the static blocks execute first in the order declared from paren to child
    //second goes the non static block of parent
    //next goes the no arg parent constructor
    //third non static blocks if any
    //In this case next goes to no arg cons of child due to this() in the child arg cons
    // then the last goes to the child arg cons
    // then returns to the main print
    public static void main(String[] args)  
    { 
        new InheritBlocksConstructor("Geek"); 
        new Building("Geek"); 
    	System.out.println("Main statement is shown");
    } 
    
    static {
    	System.out.println("Only static2 print statement is shown");
    	
    }
    static {
    	System.out.println("Only static3 print statement is shown");
    	
    }
}
