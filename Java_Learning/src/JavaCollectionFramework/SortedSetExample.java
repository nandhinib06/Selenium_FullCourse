package JavaCollectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;



public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet s = new TreeSet(); 

	      s.add("Bob");

	      s.add("Sean");

	      s.add("Jennifer");
	      

	      java.util.Iterator it = s.iterator(); //doubt

	      while (it.hasNext()) {

	      Object element = it.next();

	      System.out.println(element.toString());

	      }

	}

}
