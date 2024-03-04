package exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frmaes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		//Actions action = new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.xpath("(//a[normalize-space()='Next'])[1]"))).click().build().perform();
		
		//driver.switchTo().alert();
		
		//element not clickable
		
		Thread.sleep(5000);
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		
		select.selectByIndex(10);
		
	   // driver.findElement(By.xpath("//select[@id='countries']")).click();
		
		//driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("saikrishna");
		
		
		

	}

}
