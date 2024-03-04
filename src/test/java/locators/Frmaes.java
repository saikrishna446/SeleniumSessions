package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frmaes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//Thread.sleep(12000);
		
		//driver.switchTo().frame(driver.findElement(By.id("singleframe"))); - Webelement
		
		//driver.switchTo().frame("SingleFrame"); - nameorid
		
//		driver.switchTo().frame(1); //postion
//		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bharathi");
//		
//		driver.switchTo().defaultContent();
		
		//frame inside frame
//		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		//Thread.sleep(2000);
		
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src='MultipleFrames.html']")));
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]//following::iframe[1]")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bharathi");
		
		

	}

}
