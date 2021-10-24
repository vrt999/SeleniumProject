package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://stackoverflow.com/");
//		driver.get("http://www.neu-e.de/");
		
		WebElement e1 = driver.findElement(By.xpath("//a[contains(text(),'Stack Overflow Talent')]"));
//		WebElement e2 = driver.findElement(By.xpath("//a[contains(text(),'Create an account')]"));
		Thread.sleep(5000);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e1);
		
		Thread.sleep(5000);
		//scroll by page height horizontal
/*		((JavascriptExecutor)driver).executeScript("scroll(1000,0);");
		Thread.sleep(5000);
		//scroll by page height vertical and -ve values dont work they just scroll to start
		((JavascriptExecutor)driver).executeScript("scroll(0,1000);");
*/		
		//horizontal and vertical scroll using scroll by works even without the second parameter
/*		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000);"); vertical scroll down
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(-250,0)", ""); horizontal scroll left
		Thread.sleep(5000);*/
		//scroll to an element using Javascript
//		by default it takes true and scrolls till the element is visible
//		False - page will scroll till the element is not displayed
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", e1);
//		Thread.sleep(5000);
		//scroll to element using actions class
	/*	Actions a = new Actions(driver);
		a.moveToElement(e2).build().perform();
		// Using KeyDown
		e1.sendKeys(Keys.PAGE_UP);
		//find element using javascript
		((JavascriptExecutor) driver).executeScript("document.getElementById('text-8').scrollIntoView(true);");
		
		//below one not working for scroll it only works for click
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", e1);		
		// Types of get Document elements
//		document.getElementsByClassName("intro");
//		document.querySelectorAll(".intro");
//		document.querySelector();
//		document.getElementById("intro");
//		document.getElementsByTagName("p");
 
*/
		//scroll to bottom of the page
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
		//scroll to top of the page
		Thread.sleep(5000);
		jse.executeScript("window.scrollTo(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight),0);");
		*/
		//scroll inside the element - can use scrollTop
//		Use link - https://www.w3schools.com/jsref/prop_element_clientleft.asp
		
		//link - https://www.360logica.com/blog/multiple-ways-to-scroll-a-page-using-selenium-webdriver/
/*		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript(
		    "document.getElementById('gvLocationHorizontalRail').scrollLeft += 250", "");
//		scroll to bottom using actions class
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		actions.sendKeys(Keys.ALT);*/
		
		
	}

}
