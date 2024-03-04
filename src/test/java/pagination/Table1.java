package pagination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table1 {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> ele=driver.findElements(By.xpath("//table[@id=\"tablepress-1\"]//tbody//tr//td[2]"));
		
		System.out.println(ele.size());
		
		for(int i=0; i<=ele.size();i++) {
			
			System.out.println(ele.get(i).getText());
		}
	}

}
