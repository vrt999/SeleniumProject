package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCheck {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")).click();
		// Isdisplayed can be used for all elements
		Thread.sleep(2000);
		boolean b = driver.findElement(By.name("terms")).isDisplayed();// for submit button
		System.out.println("button is displayed:" + b);
		
		boolean b1 = driver.findElement(By.name("terms")).isEnabled();
		System.out.println("button is before enabled:" + b1);
		
		driver.findElement(By.name("terms")).click();
		//iSEnabled is to check if it is enabled
		boolean b3 = driver.findElement(By.name("terms")).isEnabled();
		System.out.println("button is after enabled:" + b3);
		
		//isSelected is only dropbdown,checkbox and radio button
		boolean b2 = driver.findElement(By.name("terms")).isSelected();
		System.out.println("button is selected:" + b2);
		

	}

}
