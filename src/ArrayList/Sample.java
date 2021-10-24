package ArrayList;

import java.util.*;

public class Sample {
	public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("Red");
	al.add("Green");
	al.add("black");
	al.add("purple");
	al.add("pink");
	System.out.println("The arraylist of colors: " + al);
	
//	Iterator<String> i = al.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
	System.out.println("******After inserting a new at first pos*****");
	al.add(0, "White");
	System.out.println("The new ArrayList: " + al);
	
	System.out.println("******After updating a new at first pos*****");
	al.set(0, "Olive");
	System.out.println("The New arraylist after update: " + al);
	
	System.out.println("The fifth element : " + al.get(4));
	al.remove(1);
	System.out.println("The new arralist after remove: "+ al);
	System.out.println("Arraylist after remove: " + al);
	Collections.shuffle(al);
	System.out.println("Arraylist after shuffle: " + al);
	Collections.sort(al);
	System.out.println("Arraylist after sort" + al);
	System.out.println("The position of black: " + Collections.binarySearch(al, "black"));
	ArrayList<String> al2 = new ArrayList<String>();
	Collections.copy(al2, al);
	al2.addAll(al);
	System.out.println("The copide Array: " + al2);
	Collections.reverse(al);
	System.out.println("The reversed arraylist: " + al );
	al2 = (ArrayList<String>) al.subList(0, 3);
	System.out.println("Th portion array: " + al2);
	Collections.swap(al, 0, 1);
//	cutdown the size of any Array
	al.trimToSize();
//	increase the size of the arraylist
	al.ensureCapacity(9);
	LinkedList<String> ll = new LinkedList<String>();
	
	
	
	
	
	}
//	52848201642
}
