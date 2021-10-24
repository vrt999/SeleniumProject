package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		ArrayList al  = new ArrayList();		
		
		for(int i = 0;i<10;i++)
		{
			al.add(i);
		}
		
		System.out.println(al);
		
		ListIterator lit = al.listIterator();
		
		if(lit.hasNext()) {
//			int i = (Integer)lit.next();
			
//			System.out.println("I value: " + i);
			
//			lit.set(11);
			lit.add(11);
		}
		
		System.out.println(al);


	}

}
