/*package whatever //do not write package name here */

//LinkedList is a class just like others ArrayList and Stack etc
//But it implements two interfaces i.e List and Queue

//Program Using LinkedList Queue

//Queue is FIFO

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(12);
		queue.offer(34); //add element to queue
		queue.offer(36); //could be done using queue.add() but has Exceptions
		
		System.out.println(queue);
		
		System.out.println(queue.poll()); //Removes first element in queue
		
		System.out.println(queue.peek()); //Shows us first element in queue
		
	}
}