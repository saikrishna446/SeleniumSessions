package locators;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

	//sel 4.x
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(15000);
		
		WebElement ele = driver.findElement(By.linkText("Saskatoon, Canada"));
		
		String index = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(index);
		
		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(rank);

		String below = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(below);
		
		String above = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(above);
		
		String near = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(near);
		
		List<WebElement> aboveList = driver.findElements(with(By.tagName("a")).above(ele));
		for(WebElement e : aboveList) {
			System.out.println(e.getText());
		}
		
		
	}

}
