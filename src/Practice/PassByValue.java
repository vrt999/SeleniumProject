package Practice;

public class PassByValue 
{ 
	public static void swap(Integer i, Integer j)  
	   { 
	      Integer temp = new Integer(i); 
	      i = j; 
	      j = temp; 
	   } 
	   public static void main(String[] args)  
	   { 
	      Integer i = new Integer(10); 
	      Integer j = new Integer(20); 
	      swap(i, j); 
	      System.out.println("i = " + i + ", j = " + j); 
	   }
}

/*class Test 
{ 
    int x; 
    Test(int i) { x = i; } 
    Test()      { x = 0; } 
} 
  
class Main 
{ 
    public static void main(String[] args) 
    { 
        // t is a reference 
        Test t = new Test(5); 
  
        // Reference is passed and a copy of reference 
        // is created in change() 
        change(t); 
  
        // Old value of t.x is printed 
        System.out.println(t.x); 
    } 
    public static void change(Test t) 
    { 
        // We changed reference to refer some other location 
        // now any changes made to reference are not reflected 
        // back in main 
        t = new Test();
        
         //if no new object is created the below X chnages will be reflected back in the main method
  
        t.x = 10; 
    } 
}*/


