package com.wellsfargo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import static org.junit.Assert.*;

public class RPNCalculatorTest{

	private RPNCalculator rpnCalculator;
	private String rpnMathExpression;
	private double expectedResult, actualResult;
	private RPNCalculatorService service;

	@Given("the input is {string}")
	public void the_input_is(String rpnMathExpression) {
    	// Write code here that turns the phrase above into concrete actions
		this.rpnMathExpression = rpnMathExpression;
	}	

	@When("I evaluate the rpn math expression")
	public void i_evaluate_the_rpn_math_expression() {
    	// Write code here that turns the phrase above into concrete actions
		//rpnCalculator = new RPNCalculator();
		service = new RPNCalculatorService();
		rpnCalculator = service.getRPNCalculator();
		
		actualResult = rpnCalculator.calculate(rpnMathExpression); 
    	//throw new cucumber.api.PendingException();
	}

	@Then("I expect the {string}")
	public void i_expect_the(String expectdResult) {
    	// Write code here that turns the phrase above into concrete actions
		expectedResult = Double.parseDouble(expectdResult);
		assertEquals (expectedResult, actualResult, 0.001);
    	//throw new cucumber.api.PendingException();
	}
}

