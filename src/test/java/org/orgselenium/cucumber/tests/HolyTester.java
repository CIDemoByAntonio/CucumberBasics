package org.orgselenium.cucumber.tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolyTester {

	@Given("^I am a \"([^\"]*)\" tester$")
	public void I_am_a_bad_tester(String testerType )throws Throwable{
		System.out.println("****************************");
		System.out.println("@Given - I am a " + testerType + " tester");
	}
	@When ("^I go to work$")
	public void when_I_go_to_work ()throws Throwable{
		System.out.println("@When - I go to work");
		
	}
	@Then("^I \"([a-zA-Z]{1,})\" it$")
	public void then_I_mess_with_it (String p)throws Throwable{
		System.out.println("@Then - I " + p + " it");
	}
	@And ("^My boss \"([a-zA-Z]{1,})\" me$")
	public void and_my_bos_fires_me(String p)throws Throwable{
		System.out.println("@And - My boss " + p + " me");
	}
	@But ("^The developer \"([a-zA-Z]{1,})\" me$")
	public void developer_likes_me(String p)throws Throwable{
		System.out.println("@But - The developer " + p + " me");
	}
}
