package Practice;

class Writer 
{ 
    public  static void write() 
    { 
        System.out.println("Writing parent"); 
    } 
} 
class Author extends Writer 
{ 
/*    public  static void write() 
    { 
        System.out.println("Writing book"); 
    } */
} 
  
public class StaticMethodOverride extends Author 
{ 
    public  static void write() 
    { 
        System.out.println("Writing child"); 
    } 
  
    public static void main(String[] args) 
    { 
    	Writer a = new StaticMethodOverride(); 
        a.write(); 
    }  	
} 

// Depends on the reference type of the objcet to check which Static method has to be taken

//Always the static of the reference type is executed
