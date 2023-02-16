package ArrayListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("List before reversing :\n" + list_Strings);  
		  Collections.reverse(list_Strings);
		  System.out.println("List after reversing :\n" + list_Strings); 

	}

}
