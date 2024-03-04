package locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		By rightClickBtn = By.xpath("//span[text()='right click me']");
		By rightClickOptions = By.xpath("//ul[@class='context-menu-list context-menu-root']//span");
		
		
		
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(rightClickBtn)).perform();
		
		List<WebElement> ele= driver.findElements(rightClickOptions);
		
		for(int i=0; i<ele.size();i++) {
			String text= ele.get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("Paste")){
				ele.get(i).click();
				break;
			}
			
		}

	}

}
