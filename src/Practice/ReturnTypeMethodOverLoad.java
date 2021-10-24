package Practice;

public class ReturnTypeMethodOverLoad {
    public static int foo(int a) { return 10; } 
    public static char foo(int a, int b) { return 'a'; } // allows it as the num of arguments is also different along with return type 
//    public static char foo(int a) { return 'b'; } - compile time error as only return type is differed
  
    public static void main(String args[]) 
    { 
        System.out.println(foo(1)); 
        System.out.println(foo(1, 2)); 
    }
    
}
