package JavaCollectionFramework;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionReverseAndCopy {

	public static void main(String[] args) {
	Character[] ray= {'o','s','d','w'};
	List<Character> l2 = Arrays.asList(ray);
	System.out.println("The list is");
	output(l2);
	Collections.reverse(l2);
	System.out.println();
	System.out.println("After Reverse list");
	output(l2);
	
	Character[] newRay = new Character[4];
	List<Character> listcopy = Arrays.asList(newRay);
	
	System.out.println("Elements in listcopy");
	Collections.copy(listcopy, l2);
	output(listcopy);
	
	for(Character x : l2)
	Collections.fill(l2, x);
	System.out.println("Collection with x");
	output(l2);

	}

	public static void output(List<Character> l2) {
		for (int i=0;i<l2.size();i++) {
		System.out.println(l2);
	}

}
}
