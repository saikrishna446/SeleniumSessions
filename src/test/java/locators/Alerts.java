package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert(); // Alert class define
		
		System.out.println(alt.getText());
		
	    //alt.accept();
		
		alt.dismiss();

	    Thread.sleep(5000);
	}

}
