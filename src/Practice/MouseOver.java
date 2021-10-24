package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.geeksforgeeks.org");
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Algo')]"))).build().perform();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Topicwise')]"))).build().perform();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Sorting Algorithms')]")).click();
		
		}

}
