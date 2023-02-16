package LinkedListExercises;

import java.util.LinkedList;

public class AddElemetsLList {

	public static void main(String[] args) {
		LinkedList <String> l_list = new LinkedList <String> ();
		  // use add() method to add values in the linked list
		  l_list.add("Red");
		  l_list.add("Green");
		  l_list.add("Black");

		  // print original list
		  System.out.println("Original linked list:" + l_list);

		  // create a new collection and add some elements

		  //LinkedList <String> new_l_list = new LinkedList <String> ();
		  l_list.add(1,"White");
		  l_list.add(2,"Pink");

		  // Add the collection in the second position of the existing linked list
		  //l_list.addAll(1, new_l_list);

		  // print the new list
		  System.out.println("LinkedList:" + l_list);

	}

}
