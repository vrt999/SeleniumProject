package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

class Employee {
	String name;
	int age;
	String team;
	Employee(String name,int age,String team){
		this.name = name;
		this.age = age;
		this.team = team;
	}
	
/*	@Override
	public boolean equals(Object o) {
	    if(o == null) {
	        return false;
	    } else if (!(o instanceof Employee)) {
	        return false;
	    } else {
	        return ((Employee) o).name.equals(this.name);
	    }
	}*/
}

public class ArrayListObjects {

	public static void main(String[] args) {
		List<Employee> ar = new ArrayList<Employee>();
		Employee e1 = new Employee("Ravi",29,"QA");
		Employee e2 = new Employee("Raheem",28,"Dev");
		Employee e3 = new Employee("Raghu",27,"Admin");
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		ar.add(e1);
		
		
		List<Employee> arr = ar.subList(1, 2);//subList(m,n) - sublist will be from m to n-1
		System.out.println("*********After SubList*********");
		for (int i = 0;i<arr.size();i++) {
			Employee e = arr.get(i);
			System.out.println("name: " + e.name + ", age: " + e.age + ", team: " + e.team);
//			Collections.disjoint();
		}	
		
	
//		ar.set(0,new Employee("Raja",28,"Java Dev"));//replaces the argument at the index
		ar.add(0,new Employee("Raja",28,"Java Dev"));// adds the argument at the index by shifting the remaining to the right
		System.out.println("*********After Add*********");
		
		for (int i = 0;i<ar.size();i++) {
			Employee e = ar.get(i);
			System.out.println("name: " + e.name + ", age: " + e.age + ", team: " + e.team);
//			Collections.disjoint();
		}		
		System.out.println("The first index of e1: " + ar.indexOf(e1));
		System.out.println("The last index of e1: " + ar.lastIndexOf(e1));
		List<Employee> al = new ArrayList<Employee>();
		Employee e4 = new Employee("John",30,"QA");
		Employee e5 = new Employee("Stephen",31,"Dev");
		Employee e6 = new Employee("Robert",32,"Admin");
		al.add(e4);
		al.add(e5);
		al.add(e5);
		al.add(e6);
		
		ar.addAll(al);// Adds all the elements in the al
		System.out.println("*********After adding al********");
		for (int i = 0;i<ar.size();i++) {
			Employee e = ar.get(i);
			System.out.println("name: " + e.name + ", age: " + e.age + ", team: " + e.team);
//			Collections.disjoint();
		}
		System.out.println("The elements removed: " + ar.removeAll(al));
		System.out.println("*********After removing al********");
		for (int i = 0;i<ar.size();i++) {
			Employee e = ar.get(i);
			System.out.println("name: " + e.name + ", age: " + e.age + ", team: " + e.team);
//			Collections.disjoint();
		}
		ar.addAll(2,al);// Adds the elements at index 2 of ar
		
		System.out.println("*********After addAll with index al********");
		for (int i = 0;i<ar.size();i++) {
			Employee e = ar.get(i);
			System.out.println("name: " + e.name + ", age: " + e.age + ", team: " + e.team);
//			Collections.disjoint();
		}
		
		ar.retainAll(al); //Keeps only al elements and removes others
		
		System.out.println("*********After retaining al********");
		for (int i = 0;i<ar.size();i++) {
			Employee e = ar.get(i);
			System.out.println("name: " + e.name + ", age: " + e.age + ", team: " + e.team);
//			Collections.disjoint();
		}
		
		ar.remove(e5);//Only one gets removed even if there are duplicate elements for e5
		System.out.println("*********After remove e5********");
		for (int i = 0;i<ar.size();i++) {
			Employee e = ar.get(i);
			System.out.println("name: " + e.name + ", age: " + e.age + ", team: " + e.team);
//			Collections.disjoint();
		}
		ar.clear();
		System.out.println("ar is empty now: " + ar.isEmpty());
		
		LinkedList<Employee> ll = new LinkedList<Employee>();
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		ll.add(e4);		
		
		String[] s1 = {"black","dog","apple","parrot","cat"};		
		TreeSet<String> s = new TreeSet<String>();		
		s.addAll(Arrays.asList(s1));
		
		System.out.println("The array to treeset: " + s);		
		Iterator<String> d = s.descendingIterator();
		System.out.print("\nThe descending order is: " );
		while(d.hasNext()) {
			System.out.print(d.next() + " ");
		}		
		//more simpler way
		System.out.println("\nThe descending set: " + s.descendingSet());		
		System.out.println("The set after descending set: " + s);	
		
		 /*Collections.replaceAll(list, oldVal, newVal);
	     Collections.sort(list);
	     Collections.binarySearch(list, key);
	     Collections.reverse(list);
	     Collections.fill(list, obj);
	     Collections.addAll(c, elements);
	     Collections.list(e);
	     Collections.copy(dest, src);
	     Collections.frequency(c, o);
	     Collections.indexOfSubList(source, target);
	     Collections.lastIndexOfSubList(source, target);
	     Collections.reverseOrder();
	     Collections.asLifoQueue(deque);
	     Collections.nCopies(n, o);
	     Collections.max(coll);
	     Collections.min(coll);*/
	}
}
