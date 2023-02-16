package ArrayListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToCopyList {

	public static void main(String[] args) {
		List<String> List1 = new ArrayList<String>();
		  List1.add("apple");
		  List1.add("boy");
		  List1.add("catch");
		  List1.add("drum");
		  System.out.println("List1: " + List1);
		  List<String> List2 = new ArrayList<String>();
		  List2.add("egg");
		  List2.add("friend");
		  List2.add("google");
		  List2.add("hobby");
		  System.out.println("List2: " + List2);
		  // Copy List2 to List1
		  Collections.copy(List1, List2);
		  System.out.println("Copy List to List2,\nAfter copy:");
		  System.out.println("List1: " + List1);
		  System.out.println("List2: " + List2);

	}

}
