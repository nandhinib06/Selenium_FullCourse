package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListProgram {

	public static void main(String[] args) {
		String things[] = { "breads", "pens", "bats", "balls", "fruits", "caps" };
		List<String> list1 = new ArrayList<String>();
		for (String x : things) {
			list1.add(x);
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
		
		list1.addAll(list2);
		list2 =null;
		printList(list1);
		System.out.println("Perform remove stuff");
		removeStuff(list1,2,5);
		System.out.println("After remove stuff");
		printList(list1);
		reverseList(list1);
		
		

	}

	private static void reverseList(List<String> li1) {
		ListIterator<String> it = li1.listIterator(li1.size());
		while (it.hasPrevious()) {
			System.out.printf("%s ",it.previous());
		}
		
	}

	private static void removeStuff(List<String> li1, int from, int to) {
		li1.subList(from, to).clear();
		
	}

	private static void printList(List<String> li1) {
		try {
			for (String b : li1) {
				System.out.printf("%s\n"+b);
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(li1);
		}
		
	}

}
