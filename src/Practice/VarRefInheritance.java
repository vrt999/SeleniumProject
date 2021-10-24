package Practice;

class Check1 
{ 
    int value = 1000; 
    Check1() 
    { 
        System.out.println("Parent Constructor"); 
    } 
} 
  
class Check2 extends Check1 
{ 
    int value = 10; 
    Check2() 
    { 
        System.out.println("Child Constructor"); 
    } 
} 
  
// Driver class 
public class VarRefInheritance 
{ 
    public static void main(String[] args) 
    { 
    	Check1 obj=new Check2(); 
        System.out.println("Reference of Child Type :"
                           + obj.value); 
  
        // Note that doing "Parent par = new Child()" 
        // would produce same result 
        Check1 par = obj; 
  
        // Par holding obj will access the value 
        // variable of parent class 
        System.out.println("Reference of Parent Type : "
                           + par.value); 
    } 
} 

