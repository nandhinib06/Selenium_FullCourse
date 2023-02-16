package JavaCollectionFramework;

//import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {
	public static void main(String[] args) {
		String things[] = { "breads", "pens", "bats", "balls", "fruits", "caps" };// pendrive
		
		List<String> list1 = new ArrayList<String>();
		for (String x : things) {
			list1.add(x); //harddisk
		}
		String morethings[] = { "hats", "bats", "balls", "Prabhu" };
		List<String> list2 = new ArrayList<String>();
		for (String y : morethings) {
			list2.add(y);
		}
		System.out.println("The value of List 1");
	
		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("%s\n", list1.get(i));
		}
		System.out.println();
		System.out.println("The value of List 2");
		for (int i = 0; i < list2.size(); i++) {
			System.out.printf("%s\n", list2.get(i));
		}
		
		
		
		System.out.println();
		
		double a = 10.7;
		
  
		
		editlist(list1,list2);
		//cloud  aws
		
		
		System.out.println("After the Edit List Method");
		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("%s\n", list1.get(i));
		}
	}

public  static void editlist(Collection<String>l1, Collection<String>l2) {

	//cloud 2 azure
 Iterator<String> it = l1.iterator();
	while (it.hasNext()) {
		if(l2.contains(it.next())) {
			it.remove();
		}
			
	}
}
}
