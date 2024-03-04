package multiTabs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")).click();
		//child window
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handles);
		
//		for(String e : handlesList) {
//			System.out.println(e);
//		}
		
		String parentWidnowId = handlesList.get(0);
		String childWidnowId = handlesList.get(1);
		
		driver.switchTo().window(childWidnowId);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWidnowId);
		System.out.println(driver.getTitle());
		driver.quit();
		
		

		
	}

}
