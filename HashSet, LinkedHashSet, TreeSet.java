/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

//HashSet implementation O(1)
//LinkedHashSet implementation 
//TreeSet implementation O(logn)

class GFG {
	public static void main (String[] args) 
	{
		Set<Integer> set = new HashSet<>(); //Humesha order change hota rehta hai
// 		Set<Integer> set = new LinkedHashSet<>(); // Iske andar order maintained hota hai
// 		Set<Integer> set = new TreeSet<>(); //BST ki implementation hoti hai + Sorted form mai hote hai
		
		set.add(32);
		set.add(62);
		set.add(52);
		set.add(32);
		set.add(32);
		
		System.out.println(set);
		
		set.remove(32);
		
		set.contains(52); //returns true or false
		
// 		set.isEmpty();
		
// 		set.size();
		
// 		set.clear();
	}
}