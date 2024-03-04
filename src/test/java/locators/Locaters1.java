package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locaters1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qbank.accelq.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.id("qb-username")).sendKeys("saikrishna");
		driver.findElement(By.id("qb-password")).sendKeys("testing123");
		driver.findElement(By.className("qb-signin-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("qb-signin-button")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
