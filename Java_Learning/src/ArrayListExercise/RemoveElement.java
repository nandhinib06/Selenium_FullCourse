package ArrayListExercise;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  System.out.println(list_Strings);
		  // Remove the third element from the list.
		  list_Strings.remove(4);
		  // Print the list again
		  System.out.println("After removing element from the list:\n"+list_Strings);

	}

}
