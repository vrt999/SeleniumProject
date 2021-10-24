package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trending {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");	
		Thread.sleep(4000);
//		WebElement e = driver.findElement(By.xpath("//a[text() = 'Help']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(e).build().perform();
//		Thread.sleep(5000);
//		((JavascriptExecutor)driver).executeScript("scroll(0,2500);");
//		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000);");
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200);");
//		((JavascriptExecutor)driver).executeScript("scroll(0,-2500);");
//		driver.quit();
//		WebElement x = driver.findElement(By.xpath("//div[@id = 'title-wrapper']//a[(@id ='video-title') and contains(@aria-label, 'Saamy')]"));
//		System.out.println("x clickable: " + isClickable(x,driver));
//		x.click();
//		
		

	}
	public static boolean isClickable(WebElement webe,WebDriver driver)
	 
	{
	try
	{
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   wait.until(ExpectedConditions.elementToBeClickable(webe));
	   return true;
	}
	catch (Exception e)
	{
	  return false;
	}
	}
}
