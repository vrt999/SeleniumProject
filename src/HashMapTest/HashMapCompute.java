package HashMapTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set; 

public class HashMapCompute { 
	
	String abc = "";
  
    // Main method 
    public static void main(String[] args) 
    { 
  
        // Create a Map and add some values 
    	HashMap<String, String> map = new HashMap<>(); 
        map.put("1", "Aman"); 
        map.put("Name", "Kabir");
        map.put("Address", "Kolkata,"); 
        
        Set<Entry<String,String>> s = map.entrySet();
  
        // Print the map 
        System.out.println("Map: " + map); 
        
        

  
        // remap the values using compute() method 
        map.compute("Name", (key, val) 
                                -> val.concat(" Singh")); 
        map.compute("Address", (key, val) 
                                   -> val.concat(" West-Bengal ").concat(key)); 
        Hashtable h = new Hashtable();
       ArrayList<String> a = new ArrayList<String>();
       
  
        // print new mapping 
        System.out.println("New Map: " + map); 
//        map.compute
        
    }

    
}

