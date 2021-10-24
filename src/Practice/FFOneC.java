package Practice;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FFOneC {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
			System.out.println("Enter the browser value");
			Scanner i = new Scanner(System.in);
			int x = i.nextInt();
			if (x==1) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();}
			else if(x==2){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\vrt999\\Desktop\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
			else {
			System.setProperty("webdriver.ie.driver","C:\\Users\\vrt999\\Desktop\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();}	
			
			 Thread.sleep(5000);
			//driver.manage().window().maximize();
			driver.get("https://onecognizant.cognizant.com");
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//			driver.get("https://onecognizant.cognizant.com");
			WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id = 'username']"))));
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("455504");
			driver.findElement(By.xpath("//input[@id = 'PasswordInternal']")).sendKeys("may-2018");
			driver.findElement(By.xpath("//input[@id = 'Log_On1']")).click();
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPlatformBarSearch")));
			driver.findElement(By.id("txtPlatformBarSearch")).sendKeys("Submit Timesheet");
			driver.findElement(By.xpath("//input[@id = 'btnsearch']")).click();
			driver.switchTo().frame("appFrame");//appFrame
			WebElement element = driver.findElement(By.xpath("//div[@class = 'inActive']//h3[(text()='Submit Timesheet')]"));
//			boolean b = element.isDisplayed();
//			System.out.println("Element present: " + b );
		
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.xpath("//div[@class = 'inActive']//h3[(text()='Submit Timesheet')]"))).build().perform();
			
//			mouseHoverJScript(driver,element);
			Locatable hoverItem = (Locatable) element;
			Mouse mouse = ((HasInputDevices) driver).getMouse();
			mouse.mouseMove(hoverItem.getCoordinates());
			
			
			
			
			WebElement webe = driver.findElement(By.xpath("//div[@class = 'acitveContent']//p[contains(text(),'One click task to submit timesheet')]"));
//			wait.until(ExpectedConditions.elementToBeClickable(webe));
//			boolean c = isClickable(webe,driver);
//			System.out.println("Clickable: " + c);
			
			Locatable clickItem = (Locatable)webe;
			mouse.click(clickItem.getCoordinates());	
			//*[@id='desktopsearchresult']/ul/li[1]/div[1]
			//*[@id='desktopsearchresult']/ul/li[1]/div[2]/p
//			System.out.println("hover check : " + webe.isDisplayed());
//			webe.click();
			//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td@class='datalistrow']//input[@name= 'contact_id']
			
			String parent = driver.getWindowHandle();
			System.out.println("Parent window ID:" + parent);
			Set<String> handler = driver.getWindowHandles();	    
			int count = handler.size();
			System.out.println("Total windows:"+ count);
			for (String child:handler) {
				if(!parent.equalsIgnoreCase(child))
				{
					driver.switchTo().window(child);
//					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					System.out.println("Child window title:" + driver.getCurrentUrl());
					Thread.sleep(5000);
					}
			}
//			Select select = new Select(driver.findElement(By.className("ps-dropdown")));
//			select.selectByVisibleText("Date");
			
//			driver.findElement(By.xpath("a[@id = 'CTS_TS_LAND_WRK_SEARCH']"));  //
			
//			driver.findElement(By.xpath("//a[contains(text(),'26-MAY-2018 To 01-JUN-2018')]")).click();
			i.close();
			
		}		
		
	public void mouseHoverJScript(WebDriver driver,WebElement HoverElement) {
		try {
			if (isElementPresent(HoverElement)) {
				
				String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
				((JavascriptExecutor) driver).executeScript(mouseOverScript,HoverElement);

			} else {
				System.out.println("Element was not visible to hover " + "\n");

			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element with " + HoverElement
					+ "is not attached to the page document"
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + HoverElement + " was not found in DOM"
					+ e.getStackTrace());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while hovering"
					+ e.getStackTrace());
		}
	}

	public  boolean isElementPresent(WebElement element) {
		boolean flag = false;
		try {
			if (element.isDisplayed()
					|| element.isEnabled())
				flag = true;
			System.out.println("Flag value: " + flag);
		} catch (NoSuchElementException e) {
			flag = false;
			System.out.println("Flag value: " + flag);
		} catch (StaleElementReferenceException e) {
			flag = false;
			System.out.println("Flag value: " + flag);
		}
		return flag;
	}
	public  boolean isClickable(WebElement webe,WebDriver driver)
	 
	{
	try
	{
	   WebDriverWait wait = new WebDriverWait(driver, 5);
	   wait.until(ExpectedConditions.elementToBeClickable(webe));
	   return true;
	}
	catch (Exception e)
	{
	  return false;
	}
	}

}
