package JavaCollectionFramework;

public class MethodTypes {

	public static void main(String[] args) {
		areaCalc();
		MethodTypes obj = new MethodTypes();
		obj.nonstatic();
		

	}

	private void nonstatic() {
		System.out.println("I'm Non-static");
		
	}

	private static void areaCalc() {
		System.out.println("I'm Static");
		
	}

}
