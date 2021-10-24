package Practice;


interface Anonymous 
{ 
    public int getValue(); 
//    public int getData(); 
} 
public class Interfaceinstance  
{ 
    private int data = 15; 
    public static void main(String[] args) 
    { 
        Anonymous inner = new Anonymous() 
                { 
                    int data = 5; 
                    public int getValue() 
                    { 
                    	return getData() ;
                    } 
                    public int getData() 
                    { 
                        return data; 
                    } 
//                    system.out.println("Hello world"); This gives error as anonymous classes don't allow statements except variables and methods
                }; 
                Interfaceinstance outer = new Interfaceinstance(); 
        System.out.println(inner.getValue() + outer.data); 
    } 
} 

/*Like local classes, anonymous classes can capture variables; they have the same access to local variables of the enclosing scope:
An anonymous class has access to the members of its enclosing class.
An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final.
Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other declarations in the enclosing scope 
that have the same name. See Shadowing for more information.
Anonymous classes also have the same restrictions as local classes with respect to their members:
You cannot declare static initializers or member interfaces in an anonymous class.
An anonymous class can have static members provided that they are constant variables.
Note that you can declare the following in anonymous classes:
Fields
Extra methods (even if they do not implement any methods of the supertype)
Instance initializers
Local classes*/
