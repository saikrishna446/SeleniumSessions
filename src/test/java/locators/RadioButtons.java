package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.click(driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"))).perform();
		
		
		
	}

}
