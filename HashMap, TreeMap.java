/*package whatever //do not write package name here */

//HashMap store unique keys and maybe duplicate values
//TreeMap stores in sorted order of keys

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
// 		Map<String, Integer> numbers = new HashMap<>(); //Unsorted order
		Map<String, Integer> numbers = new TreeMap<>(); //Sorted Order on the basis of Keys
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		
		numbers.put("Two", 4); //It will Override the existing One
		
		numbers.putIfAbsent("Two", 4); //It will not Override existing
		
// 		numbers.containsKey("Two");
// 		numbers.containsValue(1);
		System.out.println(numbers);
		
		
		//Iterate inside Map
		
		for(Map.Entry<String, Integer> e : numbers.entrySet())
		{
		    System.out.println(e);
		    System.out.println(e.getKey());
		    System.out.println(e.getValue());
		}
		
		for(String key: numbers.keySet()) //Just iterate over Keys
		{
		    System.out.println(key);
		}
		
		for(Integer value: numbers.values()) //Just iterate over Values
		{
		    System.out.println(value);
		}
	}
}