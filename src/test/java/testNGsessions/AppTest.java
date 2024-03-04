package testNGsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	
	public static WebDriver driver;

	@BeforeSuite
	public void connectDB() {

		System.out.println("connectDB method");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("createUser method");

	}
	
//	connectDB method - 
//	createUser method
//	launchBrowser method
//	login method
//	pagetitle method
//	logout method
//	closeBrowser method
//	deleteUser method

	@BeforeClass
	public void launchBrowser() {
		System.out.println("launchBrowser method");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

	}
	@BeforeMethod
	public void login() {
		System.out.println("login method");
		driver.get("https://support.accelq.com/hc/en-us");
	}

	@Test
	public void aTest() {
		System.out.println("bTest method");
		System.out.println(driver.getTitle());

	}
	@Test
	public void aTest1() {
		System.out.println("aTest method");
		System.out.println(driver.getCurrentUrl());

	}

	@AfterMethod
	public void logout() {
		System.out.println("logout method");

	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser method");
		driver.quit();

	}

	@AfterTest
	public void deleteUser() {
		System.out.println("deleteUser method");

	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("disconnectDB method");

	}
}
