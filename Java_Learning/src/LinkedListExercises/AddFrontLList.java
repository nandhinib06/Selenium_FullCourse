package LinkedListExercises;

import java.util.LinkedList;

public class AddFrontLList {

	public static void main(String[] args) {
		 LinkedList<String> l_list = new LinkedList<String>();
		   // use add() method to add values in the linked list
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		     System.out.println("Original linked list:" + l_list);    
		  // Add an element to front of LinkedList
		     l_list.offerFirst("Pink");
		     System.out.println("Final linked list:" + l_list);  

	}

}
