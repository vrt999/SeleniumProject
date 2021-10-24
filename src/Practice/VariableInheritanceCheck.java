package Practice;

class Alpha 
{ 
    public String type = "a "; 
    public Alpha() {  System.out.print("alpha "); } 
} 
  
public class VariableInheritanceCheck extends Alpha 
{ 	//String type;
    public VariableInheritanceCheck()  {  System.out.print("beta ");  } 
  
    void go() 
    { 
        type = "b "; 
//        System.out.print(this.type + super.type); 
    } 
  
    public static void main(String[] args) 
    { 
    	VariableInheritanceCheck x = new VariableInheritanceCheck();
        System.out.println("The varaiable value: " + x.type);
    } 
} 
