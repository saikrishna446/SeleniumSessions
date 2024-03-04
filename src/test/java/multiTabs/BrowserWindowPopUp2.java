package multiTabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
		//child window

		Set<String> windows= driver.getWindowHandles(); // this will be retrun multple browers
		
		Iterator<String> itr= windows.iterator(); // will iterate the loop one by one
		
		String parentwindow= itr.next();
		
		String twitter= itr.next();
		
		String facebook= itr.next();
		
		driver.switchTo().window(facebook);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(twitter);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
