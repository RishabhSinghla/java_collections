/*package whatever //do not write package name here */

//Priority Queue that has max and min heap
//By default min heap is implemented

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
		Queue<Integer> pq = new PriorityQueue<>();
		
		//Same function the LinkedList Queue has
		
		pq.offer(112);
		pq.offer(34); 
		pq.offer(36);
		
		System.out.println(pq);
		
// 		pq.poll(); //Removes minimum element
// 		pq.peek(); //Shows us the minimum element
		System.out.println(pq);
		
		
		Max Heap PriorityQueue
// 		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder())
		
	}
}