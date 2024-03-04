package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qbank.accelq.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.id("qb-username")).sendKeys("qbankadmin");
		driver.findElement(By.id("qb-password")).sendKeys("qbTrnPass1&");
		driver.findElement(By.className("qb-signin-button")).click();
		Thread.sleep(12000);
		
		driver.findElement(By.xpath("//div[@id='make-a-trans-btn']")).click();
		Thread.sleep(5000);
		
		WebElement ele= driver.findElement(By.xpath("//select[@id='qbf-toaccount-input']"));
		
		Select select = new Select(ele);
		
		select.selectByValue("Electricity Bill");
		
		select.selectByVisibleText("Mortgage Payment");
		
		select.selectByIndex(2);
		
		//select.deselectByValue("Day care");
		
		//Scroll down
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("//div[contains(text(),'Complaints & Feedbacks')]")).click();
		
		Thread.sleep(5000);
		
		// Scroll up
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-350)", "");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		
		WebElement ele2= driver.findElement(By.xpath("//div[contains(text(),'Test Cases')]"));
		
		// Scrolling down the page till the element is found		
        js2.executeScript("arguments[0].scrollIntoView();", ele2);
		
        driver.findElement(By.xpath("//div[contains(text(),'Test Cases')]")).click();
        
        //https://www.browserstack.com/guide/selenium-scroll-tutorial
        
        
		

	}

}
