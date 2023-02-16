package TestNG;

import org.testng.annotations.Test;

public class SampleTestcase {
	@Test (enabled = true)
	public void firstTestcase() {
		System.out.println("The first testcase");
	}
	@Test (dependsOnMethods = "firstTestcase")
	public void secondTestcase() {
		System.out.println("The second testcase");
	}
	@Test (dependsOnMethods ="secondTestcase" )
	public void thirdTestcase() {
		System.out.println("The third testcase");
	}
	@Test (dependsOnMethods = "thirdTestcase")
	public void fourthTestcase() {
		System.out.println("The fourth testcase");
	}

}
