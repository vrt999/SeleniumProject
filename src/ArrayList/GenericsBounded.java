package ArrayList;

class Animal {
	
	 public void displayClass() 
	    { 
	        System.out.println("Inside super class Animal"); 
	    } 
	
}

class Dog extends Animal{
	 public void displayClass() 
	    { 
	        System.out.println("Inside super class Dog"); 
	    } 
	
}

class Cat extends Dog{
	 public void displayClass() 
	    { 
	        System.out.println("Inside super class Cat"); 
	    } 
	
}

class Bound<T extends Dog> {
	
	T obj;
	
	public Bound(T obj) {
		
		this.obj = obj;
		
	}
	
    public void doRunTest(){ 
        obj.displayClass(); 
    } 
	
}

public class GenericsBounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Bound<Dog> bec = new Bound<Dog>(new Dog()); 
        bec.doRunTest(); 
          
        // Creating object of sub class B and  
        // passing it to Bound as a type parameter. 
        Bound<Cat> beb = new Bound<Cat>(new Cat()); 
        beb.doRunTest(); 
          
        // complie error
/*        Bound<Animal> bea = new Bound<Animal>(new Animal()); 
        bea.doRunTest();*/

	}

}
