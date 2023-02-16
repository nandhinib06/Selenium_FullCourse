package stepdefinition;

import io.cucumber.java.en.Given;

public class ExpressionStepDefn {

	
	@Given("the user enters {string}")
	public void the_user_enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	System.out.println("The user name is "+string);
	
	}
	@Given("the user enters age {int}")
	public void the_user_enters_age(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("The user age is "+int1);
	
	}
	@Given("the user height {double} and weight {int}")
	public void the_user_height_and_weight(Double double1, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("The user height is "+double1+"and weight is "+int1);
	
	}

}
