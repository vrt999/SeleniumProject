package Practice;

class Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Animal");
    }
    
    public void callme1()
    {
        System.out.println("In callme1 of Animal");
    }
    
    
    
}


class Dog extends Animal 
{ 
    @Override
	public void callme()
    {
        System.out.println("In callme of Dog");

    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }
}


public class TypeCastCheck 
{
    public static void main (String [] args) 
    {
        Dog d = new Dog();      
//        Cat a = d;// compile error
        Animal a = d;
        System.out.println("Below is D's method call");
        d.callme();
        System.out.println("Below is A's method call");
        a.callme();// executes dog method only due to overide
        a.callme1();
        System.out.println("Below is A's typecast method call");
        ((Dog) a).callme2();
        
        Animal animal = new Animal(); // Maybe a Dog? Maybe a Cat? Maybe an Animal?
        if (animal instanceof Dog) {
            // Guaranteed to succeed, barring classloader shenanigans
            Dog castedDog = (Dog) animal;
        }
    }
}

