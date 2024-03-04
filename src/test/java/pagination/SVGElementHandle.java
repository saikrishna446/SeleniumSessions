package pagination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(10000);
		
		driver.switchTo().frame(0);

		List<WebElement> statesList = 
				driver.
				findElements
				(By.xpath("//*[@id='map-svg']//*[@id='features']//*[@id='regions']//*[@class='region']//*[@class='rpath']//*[@class='child']"));
		//*[@id='map-svg']//*[@id='features']//*[@id='regions']//*[@class='region']//*[@class="rpath"]//*[@class="child"]
		System.out.println(statesList.size());
		
		//Actions act = new Actions(driver);
		for(WebElement e : statesList) {
			//act.moveToElement(e).perform();
			String name = e.getAttribute("name");
			System.out.println(name);
//				if(name.equals("Maryland")) {
//					act.click(e).perform();
//					break;
//				}
		}
		
	}

}
