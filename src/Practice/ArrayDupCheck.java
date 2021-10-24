package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDupCheck {
	
		
		//element repitition count
/*		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i:a) 
			al.add(i);		
		for(int i=0;i<al.size();i++)	
			System.out.println("Element frequency of" + al.get(i) + ": " + Collections.frequency(al, al.get(i)));*/
		
		
		//{1,1,2,2,3,3,1,4}	

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		// Form a list of numbers from 0-9.
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}

		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("Input list : " + list);
		processList(list);
		
	}

	public static void processList(List<String> listContainingDuplicates) {

		final Set<String> resultSet = new HashSet<String>();
		final Set<String> tempSet = new HashSet<String>();

		for (String yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) {
				resultSet.add(yourInt);
			}
		}
		tempSet.removeAll(resultSet);
		
		System.out.println("Filtered duplicates : " + resultSet);
		System.out.println("Non duplicates : " + tempSet);
	}

}
