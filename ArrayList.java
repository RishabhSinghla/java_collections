/*package whatever //do not write package name here */
//java.util mai sare collection hote hai
//ArrayList collection
//Dynamic Hota Hai

//If size of ArrayList is N = 10
//It will increase its size by = N + N/2 + 1 = 16

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
// 		ArrayList<String> studentName = new ArrayList<>();
// 		studentName.add("Rishabh");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println(list);
        
        list.add(1,50);  //adds 50 at index 1
        
        List<Integer> newList = new ArrayList<>();
        
        newList.add(77); //add krne pe sare element right shift hote hai
        newList.add(88);
        
        list.addAll(newList); //add all will add all the elements of list to newList
        
        System.out.println(list);
        
        list.get(2); //gets 2nd index element
        
        list.remove(1); //remove 1st index element
        //Delete krne pe sare element left shift ho jate hai
        list.remove(Integer.valueOf(77)); //remove 77 value
        
        System.out.println(list);
        
        list.clear(); //deletes all element in the list
        
        
        list.set(1, 1000); //It changes value of index 3 to 1000
        
        System.out.println(list);
        
        list.contains(50); //returns true or false if element is present or not
        
        //If we want to traverse an ArrayList
        
        //1st Way
        for(int i=0; i<list.size(); i++)
        {
            
        }
        
        //2nd Way -> For each loop
        for(Integer ele : list)
        {
            
        }
        
        //3rd Way -> Iterator in each Collection
        
        Iterator<Integer> it = list.iterator();
        
        while(it.hasNext()) //It will iterate until it has next
        {
            System.out.println(it.next); //it.next to print element
        }
	}
}