package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasicnavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.automationtesting.in/Frames.html");
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize(); // Maxmize the window
		
		Thread.sleep(5000);
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"))).build().perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Windows']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());

	}

}
