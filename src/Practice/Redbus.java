package Practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		driver.get("https://www.geeksforgeeks.org");
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		select.selectByVisibleText("Art");
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

		

	}

}
