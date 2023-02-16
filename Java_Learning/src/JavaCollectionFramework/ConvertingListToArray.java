package JavaCollectionFramework;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertingListToArray {

	public static void main(String[] args) {
		String[] morethings = {"hats","bats","balls","breads","pens","fingers","fruits","caps","photos","wings","balls","hats"};
        LinkedList<String> thelist = new LinkedList<>(Arrays.asList(morethings));
        thelist.add("blue");
        thelist.addFirst("Nandhini");
        morethings = thelist.toArray(new String[thelist.size()]);
        for (String x : morethings) {
        	System.out.printf("%s\n", x);
        }
	}

}
