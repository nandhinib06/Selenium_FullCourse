package LinkedListExercises;

import java.util.LinkedList;

public class AddTwoList {

	public static void main(String[] args) {
		 LinkedList <String> c1 = new LinkedList <String> ();
		  
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         System.out.println("List of first linked list: " + c1);
        LinkedList <String> c2 = new LinkedList <String> ();
         c2.add("Blue");
         c2.add("Grey");
         c2.add("Brown");
         c2.add("Purple");
         System.out.println("List of second linked list: " + c2);
       
     // Let join above two list
       //LinkedList <String> a = new LinkedList <String> ();
       //a.addAll(c1);
       c1.addAll(c2);
       System.out.println("New linked list: " + c1);

	}

}
