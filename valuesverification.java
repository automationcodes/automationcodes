package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static StepDefinitions.Demo_TestRunner.CommonLocators;
import static StepDefinitions.Demo_TestRunner.driver;

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

	String Pvalue1, Pvalue2, Pvalue3, Pvalue4, Pvalue5, Ptotal;
	double NumberValue1, NumberValue2, NumberValue3, NumberValue4, NumberValue5;

	@Given("^User is in value page$")
	public void user_value() throws Throwable {

	}

	@When("^User enters value1$\"([^\"]*)\"$")
	public void User_enters_value1(String value1) throws Throwable {
		// Pvalue1=driver.findElement(By.id("id"));

	}

	@When("^User enters value2$\"([^\"]*)\"$")
	public void User_enters_value2(String value2) throws Throwable {
		// Pvalue1=driver.findElement(By.id("id"));
		assertEquals(Pvalue2, value2);
	}

	@When("^User enters value3$\"([^\"]*)\"$")
	public void User_enters_value3(String value3) throws Throwable {
		// Pvalue1=driver.findElement(By.id("id"));
		assertEquals(Pvalue3, value3);
	}

	@When("^User enters value4$\"([^\"]*)\"$")
	public void User_enters_value4(String value4) throws Throwable {
		// Pvalue1=driver.findElement(By.id("id"));
		assertEquals(Pvalue4, value4);
	}

	@When("^User enters value5$\"([^\"]*)\"$")
	public void User_enters_value5(String value5) throws Throwable {
		// Pvalue1=driver.findElement(By.id("id"));
		assertEquals(Pvalue5, value5);
	}

	@When("^User_verify_right_count$")
	public void User_verify_right_count() throws Throwable {
           WebElement selectElement = driver.findElement(By.id("id"));
           Select listBox = new Select(selectElement);
           int size1 = listBox.getOptions().size();
	}

	@When("^greather_than_zero$")
	public void greathe_than_zero() throws Throwable {
		 NumberValue1 = Double.parseDouble(Pvalue1.replaceAll("[^0-9]", ""));
		 NumberValue2 = Double.parseDouble(Pvalue2.replaceAll("[^0-9]", ""));
		 NumberValue3 = Double.parseDouble(Pvalue3.replaceAll("[^0-9]", ""));
		 NumberValue4 = Double.parseDouble(Pvalue4.replaceAll("[^0-9]", ""));
		 NumberValue5 = Double.parseDouble(Pvalue5.replaceAll("[^0-9]", ""));
		assertEquals(NumberValue1 > 0, true);
		assertEquals(NumberValue2 > 0, true);
		assertEquals(NumberValue3 > 0, true);
		assertEquals(NumberValue4 > 0, true);
		assertEquals(NumberValue5 > 0, true);

	}

	@When("^total balance$\"([^\"]*)\"$")
	public void total_balance(String totalbalance) throws Throwable {
		// Ptotal= Pvalue1=driver.findElement(By.id("id")); //helperbase element Text
		// method
		double NumberTotal = NumberValue1 + NumberValue2 + NumberValue3 + NumberValue4 + NumberValue5;
		assertEquals(NumberTotal, totalbalance.replaceAll("[^0-9]", ""));

	}

	@When("^currencies$")
	public void currencies() throws Throwable {
             WebElement select=driver.findElement(By.id("selected"));
             select.getText();
             System.out.println("Currency Selected:" +select.getText());
	}

	@When("^sum values$\"([^\"]*)\"$")
	public void sum_values(String sumvalues) throws Throwable {

        List<WebElement> elem1 = driver.findElements(By.id("id"));
        int sum = 0;
        for(WebElement li1:elem1)
        {
            System.out.println(li1.getText());
            String s = li1.getText().replace("(", "");
            sum = sum + Integer.parseInt(s.replace(")", ""));
        }
        System.out.println("Total sum is: " + sum);

        int totalAppearingOnPage = Integer.parseInt(driver.findElement(
                By.id("")).
                getText());

	}
}
