package Practice;


class Alpha1  
{ 
    static String s = " "; 
    protected Alpha1()  ///Compiler error if the parent no arg constructor is mentioned as private as it wont be viisble to the cild classes
    { 
        s += "alpha "; 
    } 
} 
class SubAlpha extends Alpha1  
{ 
    private SubAlpha()  
    { 
        s += "sub "; 
    } 
} 
  
public class InheritanceConsCheck extends Alpha1  
{ 
    private InheritanceConsCheck()  
    { 
        s += "subsub "; 
    } 
    public static void main(String[] args)  
    { 
        new InheritanceConsCheck(); 
        System.out.println(s); 
    } 
}
 

