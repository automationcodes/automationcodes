package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static StepDefinitions.Trigger_TestRunner.CommonLocators;
import static StepDefinitions.Trigger_TestRunner.driver;

import static StepDefinitions.MethodCall.*;
import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class valuesverification {

	@Given("^User is in value page$")
	public void user_value() throws Throwable {
	

	}

	@When("^User enters value1$\"([^\"]*)\"$")
	public void User_enters_value1(String value1) throws Throwable {
	
	}
	@When("^User enters value2$\"([^\"]*)\"$")
	public void User_enters_value2(String value2) throws Throwable {
	
	}
	@When("^User enters value3$\"([^\"]*)\"$")
	public void User_enters_value3(String value3) throws Throwable {
	
	}
	@When("^User enters value4$\"([^\"]*)\"$")
	public void User_enters_value4(String value4) throws Throwable {
	
	}
	@When("^User enters value5$\"([^\"]*)\"$")
	public void User_enters_value5(String value5) throws Throwable {
	
	}
	
	
	@When("^User_verify_right_count$")
	public void User_verify_right_count() throws Throwable {
	
	
	}	
	
	@When("^greather_than_zero$")
	public void greathe_than_zero() throws Throwable {
	
	
	}	
	
	@When("^total balance$\"([^\"]*)\"$")
	public void total_balance(String totalbalance) throws Throwable {
	
	}
	
	
	@When("^currencies$")
	public void currencies() throws Throwable {
	
	
	}	
	
	@When("^sum values$\"([^\"]*)\"$")
	public void sum_values(String sumvalues) throws Throwable {
	
	}
}

	