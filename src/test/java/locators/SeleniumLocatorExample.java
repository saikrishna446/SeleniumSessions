package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		driver.manage().window().maximize();

        // Navigate to a website
        driver.get("https://example.com");

        // Example using ID locator
        WebElement elementById = driver.findElement(By.id("elementId"));

        // Example using Name locator
        WebElement elementByName = driver.findElement(By.name("elementName"));

        // Example using Class Name locator
        WebElement elementByClassName = driver.findElement(By.className("className"));

        // Example using Tag Name locator
        WebElement elementByTagName = driver.findElement(By.tagName("tagName"));

        // Example using Link Text locator
        WebElement elementByLinkText = driver.findElement(By.linkText("Link Text"));

        // Example using Partial Link Text locator
        WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("Partial Link"));

        // Example using CSS Selector locator
        WebElement elementByCssSelector = driver.findElement(By.cssSelector("cssSelector"));

        // Example using XPath locator
        WebElement elementByXPath = driver.findElement(By.xpath("//xpathExpression"));

        // Close the browser
        driver.quit();
		

	}

}
