import java.util.ArrayList;
import java.util.List;

class Testa {
	
}

class Testb extends Testa{
	
}

class Testc extends Testb{
	
}

class Animal {
	
}

class Dog extends Animal{

	
}

class Cat extends Animal{
	 
}






public class GenericsTest {
	
	public void method1() {
	
/*  List<Object> objectsBad = new ArrayList<Testa>(); //1. COMPILE ERROR
    List<Testa> petsBad = new ArrayList<Testb>();//2. COMPILE ERROR
*/	
	//valid
	List<?> list0 = new ArrayList<Testa>();// list accepts any data types
	List<? extends Testa> list1 = new ArrayList<Testc>();	
	List<? extends Testa> list2 = new ArrayList<Testa>();	
	List<? extends Testa> list3 = new ArrayList<Testb>();
	
	//Invalid
//	List<? extends Testa> list4 = new ArrayList<Object>();	
//	List<Testa> list5 = new ArrayList<Testb>();	
//	List<Testb> list6 = new ArrayList<Testa>();
	
	
	List<Animal> animals = new ArrayList<Animal>(); // ArrayList implements List
//	List<Animal> animals = dogs; // Awooga awooga
	
	animals.add(new Cat());
	
	List<? super Testb> superA = new ArrayList<Testa>();
	
	superA.add(new Testc());
	
	superA.get(0);
	
	Testa aa = new Testa();
	Testa ab = new Testa();
	Testa ac = new Testa();
	Testa ad = new Testa();
	Testa ae = new Testa();
	
	Testb ba = new Testb();
	
	Testc ca = new Testc();
	
	ArrayList<Testa> arrA = new ArrayList<Testa>();
	arrA.add(aa);
	arrA.add(ab);
	arrA.add(ac);
	arrA.add(ad);
//	arrA.add(ae);
	
	List<? super Testb> arrAA = arrA;
	
	//complie error
//	arrAA.add(ae);
	
	arrAA.add(ba);
	
	arrAA.add(ca);
	
	
	
	
	
	
	
	
	}	
	
	

}
