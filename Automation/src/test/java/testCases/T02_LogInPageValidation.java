package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T02_LogInPageValidation {

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

	public static void LogInpage() {

		// load the application under test
		driver.get("https://forum.digitalpoint.tech/user/index.php/login");

		// login page title validation
		String ExLogInTitle = "Digital Point - Forum | User Login";
		String AcLogInTitle = driver.getTitle();

		AssertJUnit.assertEquals(AcLogInTitle, ExLogInTitle);
		
		//find the email box and send data into this
		driver.findElement(By.name("email")).sendKeys("sparkz.arabi@gmail.com");
		
		//find the password element and send data into this
		driver.findElement(By.name("password")).sendKeys("R@fialarabi12");
		
		//find the submit button and click submit
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
	}
	
	@AfterMethod
	
	public static void closeBrowser() {
		//closing the browser
		//driver.close();
	}
}