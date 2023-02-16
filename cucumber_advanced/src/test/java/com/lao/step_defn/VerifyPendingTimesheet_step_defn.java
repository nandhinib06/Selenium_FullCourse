package com.lao.step_defn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyPendingTimesheet_step_defn {
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
	  System.out.println("the user is on the homepage");  
	}

	@When("the user clicks on the time option from the menu")
	public void the_user_clicks_on_the_time_option_from_the_menu() {
	    System.out.println("the user clicks on the time option from the menu");
	}

	@When("the user enters the name as {string}")
	public void the_user_enters_the_name_as(String string) {
	    System.out.println("the user enters the name as Smith");
	}
	@When("clicks on the view button")
	public void clicks_on_the_view_button() {
	    System.out.println("clicks on the view button");
	}

	@Then("the user should see the message as {string}")
	public void the_user_should_see_the_message_as(String string) {
	    System.out.println("the user should see the message as {string}");
	}
}
