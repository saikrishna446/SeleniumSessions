package testNGsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {

	public WebDriver driver;
	@Test(groups = {"regression"})
	@Parameters({"browser"})
	public void lanchbrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://qbank.accelq.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://qbank.accelq.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("this is firefox browser");
		}
	}
	@Test(priority = 0,groups = {"regression"})
	public void logintoApplication() {
			
		driver.findElement(By.xpath("//input[@id='qb-username']")).sendKeys("qbankadmin");
		driver.findElement(By.xpath("//input[@id='qb-password']")).sendKeys("qbTrnPass1&");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@Test(priority = 1,groups = {"sanity"})
	public void test1() {
			
		System.out.println("test1");

	}
	@Test(priority = 2,groups = {"regression"})
	public void test2() {
		System.out.println("test2");
	
		
	}
}
