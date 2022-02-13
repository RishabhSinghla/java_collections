/*package whatever //do not write package name here */

//Array Dequeue
//Double Ended Queue
//Insertion and Remove from both ends

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(23);  //same as offerLast
		adq.offerFirst(12);
		adq.offerLast(45);
		
		System.out.println(adq);
		
// 		adq.peekFirst();
// 		adq.peekLast();
// 		adq.pollLast();
// 		adq.pollFirst();
	}
}