package Practice;

import java.util.Iterator;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BrowserLogin {
	static WebDriver driver;

				
	public static void main(String[] args) throws InterruptedException {
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
			 // Create the DesiredCapability object of InternetExplorer
			 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	 
			 // Settings to Accept the SSL Certificate in the Capability object
			 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		driver = new InternetExplorerDriver();}	
		
		 Thread.sleep(5000);
		driver.manage().window().maximize();
		
		// 3 different ways to enter text in the text box
/*		1. Using JavaScript		 
		JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
		myExecutor.executeScript("arguments[0].value='Test';", weElement);
		JS.executeScript("document.getElementById('Pass').value='tester'");*/
/*		2. Using Actions class
		Actions a = new Actions(driver);
		a.sendKeys(element, "Admin");*/
//		3. element.sendKeys("Admin");
		
		/*Different ways to refresh page
		Using driver.navigate().refresh() command as mentioned in the question 45
		Using driver.get(“URL”) on the current URL or using driver.getCurrentUrl()
		Using driver.navigate().to(“URL”) on the current URL or driver.navigate().to(driver.getCurrentUrl());
		Using sendKeys(Keys.F5) on any textbox on the webpage*/
		
		
		
		
		driver.get("https://onecognizant.cognizant.com");
//		 driver.execute_script("document.getElementById('overridelink').click()");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://onecognizant.cognizant.com");
		Thread.sleep(5000);
//		String s = driver.getWindowHandle();
//		driver.switchTo().window(s);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id = 'username']")));		
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("455504");
		driver.findElement(By.xpath("//input[@id = 'PasswordInternal']")).sendKeys("dec-2018");
		driver.findElement(By.xpath("//input[@id = 'Log_On1']")).click();
		Thread.sleep(3000);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPlatformBarSearch")));
		driver.findElement(By.id("txtPlatformBarSearch")).sendKeys("Submit Timesheet");
		driver.findElement(By.xpath("//input[@id = 'btnsearch']")).click();
		driver.switchTo().frame("appFrame");//appFrame
		
//		driver.
		WebElement element = driver.findElement(By.xpath("//div[@class = 'inActive']//h3[(text()='Submit Timesheet')]"));
		boolean b = element.isDisplayed();
		Select s = new Select(element);
//		element.cl
		System.out.println("Element present: " + b );
		driver.findElement(By.xpath("//div[@class = 'inActive']//h3[(text()='Submit Timesheet')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//div[@class = 'inActive']//h3[(text()='Submit Timesheet')]"))).build().perform();
		
//		moveToElementByJS(driver,element);
		//*[@id='desktopsearchresult']/ul/li[1]/div[1]
		//*[@id='desktopsearchresult']/ul/li[1]/div[2]/p
//		driver.findElement(By.xpath("//div[@class = 'acitveContent']//p[contains(text(),'One click task to submit timesheet')]")).click();
		//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name= 'contact_id']
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID:" + parent);
		Thread.sleep(5000);

		Set<String> l = driver.getWindowHandles();
		Iterator<String> it = l.iterator();
		String p = it.next();
		String c3 = it.next();
		System.out.println("Parent: " + p);
		System.out.println("Child: " + c3);
		int count = l.size();
		System.out.println("Total windows:"+ count);
		for (String child:l) {
			if(!parent.equalsIgnoreCase(child))
			{	System.out.println("Inside loop");
				driver.switchTo().window(child);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}}
				
		System.out.println("Child window title:" + driver.getCurrentUrl());
		}}
/*				System.out.println("Child window title:" + driver.getCurrentUrl());
				Thread.sleep(5000);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[text()='19-JAN-2019 To 25-JAN-2019']")).click();
				Thread.sleep(3000);
				driver.switchTo().frame("ptifrmtgtframe");
				driver.findElement(By.xpath("//a[@id = 'CTS_EX_ACT_VW_DESCR$prompt$0']")).click();
//				driver.switchTo().alert();
				
				Thread.sleep(5000);
				driver.switchTo().parentFrame();
				WebElement f = driver.findElement(By.xpath("//iframe[contains(@src ,'ICResubmit')]"));
				driver.switchTo().frame(f);
				Thread.sleep(2000);
//				List<WebElement> list = driver.findElements(By.tagName("iframe"));
//				for(int k = 0;k<list.size();k++) {
//					System.out.println("Frame " + k +" id: " + list.get(k).getAttribute("id"));
//					
//				}

				driver.findElement(By.xpath("//span[text() = 'Integration & System Test']//parent::td//preceding-sibling::td//a")).click();
				driver.switchTo().frame("ptifrmtgtframe");
				Select s1 = new Select(driver.findElement(By.xpath("//select[@class = 'PSDROPDOWNLIST']")));
				s1.selectByVisibleText("OF");
				Select s2 = new Select(driver.findElement(By.xpath("//select[@name = 'BILLING_ACTION$0']")));
				s2.selectByVisibleText("Billable");
				for(int m=3;m<=7;m++) {
					String n = "TIME" + m + '$' + "0";
					driver.findElement(By.id(n)).sendKeys("8.5");
				}
				driver.findElement(By.xpath("//input[@id = 'PB_UPDATE_2']")).click();
				Thread.sleep(30000);
				WebElement r = driver.findElement(By.xpath("//input[@value = 'Submit with Confirmation']"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);", r);
				Thread.sleep(3000);
				WebDriverWait w = new WebDriverWait(driver, 10);
				w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value = 'Submit with Confirmation']")));
				r.click();
				
				
				
//												
//				driver.close();
			}
		}
//		Select select = new Select(driver.findElement(By.className("ps-dropdown")));
//		select.selectByVisibleText("Date");
		
//		driver.findElement(By.xpath("a[@id = 'CTS_TS_LAND_WRK_SEARCH']"));  //
		
//		driver.findElement(By.xpath("//a[contains(text(),'26-MAY-2018 To 01-JUN-2018')]")).click();
		i.close();
		
			}
//	public static void scrollToElement(WebDriver driver,WebElement element) {
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].scrollIntoView(true);", element);
//	}
	}
	
	*/


