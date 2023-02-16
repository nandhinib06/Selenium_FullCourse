package JavaCollectionFramework;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionMethodSort {

	public static void main(String[] args) {
		String[] morethings = {"hats","bats","balls","breads","pens","fingers","fruits","caps","photos","wings","balls","hats"};
		List<String> l1= Arrays.asList(morethings);
		Collections.sort(l1);
		System.out.printf("%s", l1);
		System.out.println();
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s", l1);

	}

}
