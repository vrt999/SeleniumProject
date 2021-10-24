package Practice;

import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleSearch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'lst-ib']")).sendKeys("selenium");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class = 'sbsb_b']//li/descendant::div[@class = 'sbqs_c']"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("selenium webdriver")) {
			list.get(i).click();
			break;
				}
		}

	}

	}
