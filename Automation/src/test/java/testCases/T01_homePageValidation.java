package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T01_homePageValidation {

	public static WebDriver driver;

	@BeforeMethod

	public static void openBrowser() {

		// opening the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing project\\Automation testing\\Automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		// maximizing the browser
		driver.manage().window().maximize();

		// delete all cookies
		driver.manage().deleteAllCookies();
	}

	@Test

	public static void homepage() {

		// load the application under test
		driver.get("https://digitalpoint.tech/");

		// home page title validation
		String ExTitle = "Digital Point - SQA Automation, Cyber Security, DevOps";
		String AcTitle = driver.getTitle();

		AssertJUnit.assertEquals(AcTitle, ExTitle);
	}
	
	@AfterMethod
	
	public static void closeBrowser() {
		//closing the browser
		//driver.close();
	}
}
