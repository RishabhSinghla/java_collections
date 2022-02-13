/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
		int [] num = {1,2,3,4,5,6};
		int index = Arrays.binarySearch(num, 4);
		
		Integer [] num = {1,2,3,4,5,6};
		Arrays.sort(num); //Uses Quick Sort
		
		Arrays.fill(num, 12); //Fill numbers with 12 already
		
		
		//Can be used of Collections like ArrayList etc
		
		Collections.min(list); 
		Collections.max(list);
		Collections.frequency(list, 9);
		
		Collections.sort(list);
		
		Collections.sort(list, Comparator.reverseOrder());
	}
}