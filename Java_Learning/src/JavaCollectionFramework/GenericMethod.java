package JavaCollectionFramework;

public class GenericMethod{

	public static void main(String[] args) {
		System.out.println(max(90,20,50));
		System.out.println(max(5.2,45.14,98.42));
		System.out.println(max("asds","asdfghj","qwertyujhnbvc"));

	}

	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T m=a;
		if(b.compareTo(a)>0)
			m=b;
		if(c.compareTo(m)>0)
			m=c;
		return m;
	}

}
