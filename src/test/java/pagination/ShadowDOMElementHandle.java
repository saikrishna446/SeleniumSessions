package pagination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMElementHandle {

	static WebDriver driver;
	static List<WebElement> ele;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//driver.findElement(By.id("tea")).sendKeys("masala tea");
		
		//Br--page--iFrame--shadowDOM --input
		
		driver.switchTo().frame("pact");
		
	    ele= driver.findElements(By.xpath(""));
		
		//document.querySelector("#snacktime").shadowRoot.querySelector("#tea")
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement tea = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		tea.sendKeys("Masala Tea");
		ele.size();
		
		for(int i=0;i<=ele.size();i++) {
			if(ele.get(i).getText().equalsIgnoreCase("June")) {
				
			}
			else {
				//click on next element
			ele= driver.findElements(By.xpath(""));
			}
		}
	}

}
