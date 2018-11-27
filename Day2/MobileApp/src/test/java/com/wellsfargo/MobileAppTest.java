package com.wellsfargo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import static org.junit.Assert.*;


public class MobileAppTest {

	private Mobile mobile;
	private ICamera camera;
	private boolean expectedResponse, actualResponse;

	@Given("The camera is functionally normally")
	public void the_camera_is_functionally_normally() {

		 camera = new Camera();
    	// Write code here that turns the phrase above into concrete actions
    	throw new cucumber.api.PendingException();
	}

	@When("I invoke Mobile powerOn")
	public void i_invoke_Mobile_powerOn() {

		mobile = new Mobile(camera);
		actualResponse = mobile.powerOn();
    	// Write code here that turns the phrase above into concrete actions
    	throw new cucumber.api.PendingException();
	}

	@Then("I expect the Camera to be turned on successfully")
	public void i_expect_the_Camera_to_be_turned_on_successfully() {

		assertEquals (expectedResponse, actualResponse);
    	// Write code here that turns the phrase above into concrete actions
    	throw new cucumber.api.PendingException();
	}

}
