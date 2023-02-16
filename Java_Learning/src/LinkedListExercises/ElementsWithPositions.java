package LinkedListExercises;

import java.util.LinkedList;

public class ElementsWithPositions {

	public static void main(String[] args) {
		// create an empty linked list
	     LinkedList<String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          l_list.add("Red");
	          l_list.add("Green");
	          l_list.add("Black");
	          l_list.add("Pink");
	          l_list.add("orange");
	      
	      // print original list
	   System.out.println("Original linked list:" + l_list);  
	  for(int i=0; i < l_list.size(); i++)
	   {
	      System.out.println("Element at index "+i+": "+l_list.get(i));
	    } 

	}

}
