package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class NoDriver {
		public static void main(String[] args) {
			int i=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://onecognizant.cognizant.com");
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(Keys.chord(Keys.SHIFT,Keys.F10));
		WebElement ele = driver.findElement(By.xpath("//input[@id = 'username']"));
		Actions action = new Actions(driver);
		action.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

		

		}

	}

