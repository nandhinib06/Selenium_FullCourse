package ArrayListExercise;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElement {

	public static void main(String[] args) {
		
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  System.out.println(list_Strings);
		  // Retrive the first and third element
		  //String element = list_Strings.get(0);
		  System.out.println("First element: "+list_Strings.get(0));
		  //element = list_Strings.get(2);
		  System.out.println("Third element: "+list_Strings.get(2));
		  System.out.println("Fifth element: "+list_Strings.get(4));
	}

}
