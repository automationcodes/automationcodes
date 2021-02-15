package StepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;

import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions

(features = { "src/test/resources/features" },

		glue = "StepDefinitions", plugin = { "com.cucumber.listener.ExtentCucumberFormatter:",
				"html:test-output/cucumber-report" },
	  tags =  {"@Values_verification,@Values"})


		
       
		
public class Demo_TestRunner extends AbstractTestNGCucumberTests {

	public static WebDriver driver;
	public FileInputStream fs;
	public static Properties CommonLocators;
	public ExtentReports report;
	
	
	private static String outputDir = "test-output/" + new Date().toString().substring(0, 10);
	private static String timestamp = new SimpleDateFormat("_HHmmss").format(new Date());


	public void setUP() throws IOException {

		System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir") + "\\chromedriver.exe"));
		driver = new ChromeDriver();

		driver.get("https://www.exercise1.com/values");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CommonLocators = new Properties();
		fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Trigger_Files\\CommonLocators.properties");
		CommonLocators.load(fs);

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath(outputDir + "/Demo_ExtentReport" + timestamp + ".html");
		
		  
	}

	public void tearDown() throws Exception {
		Reporter.loadXMLConfig(System.getProperty("user.dir") + "\\src\\test\\resources\\configs\\extent-config.xml");
		// driver.close();

	}


	public void embedScreenshot(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			try {
				File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				FileUtils.copyFile(screenshotFile, new File(
						System.getProperty("user.dir") + "\\Screenshots\\demo_Screenshots" + dateName + ".png"));
			} catch (WebDriverException e) {
				e.printStackTrace();
			}
		}
	}
	
}
