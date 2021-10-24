package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDivTest {

	public static void main(String[] args) throws Exception {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\vrt999\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paytm.com");
		Thread.sleep(5000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);	
		
		WebElement e = driver.findElement(By.xpath("//div[@class = '_2CU_']"));
		e.click();
		
//		WebElement e1 = driver.findElement(By.xpath("//section[@id = 'section-basic-example']//div[@class = 'ps__thumb-x']"));
		WebElement e1 = driver.findElement(By.xpath("//span[text() = 'Vi']"));
		WebElement e2 = driver.findElement(By.xpath("//div[@class = '_14mD']"));
		//working
		js.executeScript("arguments[0].scrollIntoView(false);", e1);// false keeps the element at the bottom of the page
		//working
		js.executeScript("arguments[0].scrollIntoView({block: \"center\"});", e1);
		//working
//		Actions a = new Actions(driver);
//		a.moveToElement(e1).build().perform();
//		Thread.sleep(10000);
//		js.executeScript("arguments[0].scrollTop = 240;", e1);
		
		//Working
//		js.executeScript("document.querySelector('div._14mD').scrollTop=57;");	
		//Working
//		js.executeScript("arguments[0].scrollTop = 57;", e2);
		
		Long x = (Long)js.executeScript("return document.querySelector('div._14mD').scrollHeight;");
		System.out.println("The scroll height of first div:" + x);
		
		Long y = (Long)js.executeScript("return document.querySelector('div._14mD').scrollTop;");
		System.out.println("The scroll Top of first div:" + y);
		Thread.sleep(10000);
		
//		driver.quit();
	}

}
