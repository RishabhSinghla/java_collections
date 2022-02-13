/*package whatever //do not write package name here */

//Stack data structure (LIFO)

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
	    Stack<String> animals = new Stack<>();
	    
	    animals.push("Lion");
	    animals.push("Lion");
	    animals.push("Lion");
	    animals.push("Cat");
	    
	    System.out.printf("Stack: " + animals);
	    
	    System.out.println(animals.peek()); //sabse top element show karta hai
	    animals.pop();//sabse top element hata deta hai
	    System.out.println(animals.peek()); 
	    
	}
}