package Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AlertCheckOneC {
	static WebDriver driver1;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//launching browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://onecognizant.cognizant.com");
		
		driver1.findElement(By.id("Log_On1")).click();
		Thread.sleep(2000);
		//Handle popups
		Alert check = driver1.switchTo().alert();
		check.accept();
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getPageSource());
		
		//finding element
		driver1.findElement(By.name("name")).sendKeys("Tom");
		driver1.findElement(By.linkText("HowToPick")).click();
		driver1.findElement(By.partialLinkText("HowToPick")).click();
		driver1.findElement(By.cssSelector("HowToPick")).click();
		driver1.findElement(By.className("HowToPick")).click();
		
		//dropdown select
		Select select = new Select(driver1.findElement(By.id("state")));
		select.selectByVisibleText("Andhra Pradesh");
		
		
	
		
		//Switch To frame
		
		
		Actions action = new Actions(driver1);
		action.moveToElement(driver1.findElement(By.linkText("about Us")));
		driver1.switchTo().frame(0);
		action.clickAndHold(driver1.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(driver1.findElement(By.xpath("//*[@id = 'draggable']"))).release().build().perform();
		driver1.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement e = driver1.findElement(By.xpath("//input[contains(@id,'test_')]"));
		
		
		//variuos ways of finding Xpath
		driver1.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
		driver1.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Test");
		driver1.findElement(By.xpath("//input[ends-with(@id,'test_')]")).sendKeys("Test");
		driver1.findElement(By.xpath("//a[contains(text(),'My account')]")).click();
		driver1.findElement(By.xpath("//a[text()='My account']")).click();
		driver1.findElement(By.xpath("//a[(text()='My account') and (@class = 'btn')]")).click();
		driver1.findElement(By.xpath("//div[@class = 'dropdown']//a[(text()='My account') and (@class = 'btn')]")).click();
		
		driver1.findElement(By.xpath("//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td@class='datalistrow']//input[@name= 'contact_id']")).click();
		driver1.findElement(By.xpath("//input[@name = 'ctl00$mainContent$view_date1']//following-sibling::button[@class = 'ui-datepicker-trigger']"));
		driver1.findElement(By.xpath("//a[@class = 'check']//li/descendant::div"));
		
		List <WebElement> linklist = driver1.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		//Navigating back and forth 
		driver1.navigate().to("https://www.amazon.in");
		driver1.navigate().back();
		driver1.navigate().forward();
		
		//Switching between the frames
		driver1.switchTo().frame("name");//name or number or webelement
		driver1.switchTo().parentFrame();
		
		
		//take screenshot
		 File src = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File("C:\\Users\\vrt999\\Desktop\\google.png"));
		 
		 //performing mouse and keyboard actions
			action.doubleClick();
			action.contextClick(e).sendKeys(Keys.ARROW_DOWN);
			e.sendKeys(Keys.chord(Keys.SHIFT,Keys.F10));
		 
		 clickOn(driver1,driver1.findElement(By.xpath("//p[contains(text(),'Submit Timesheet']")),20);
	}
		 
			public static void clickOn(WebDriver driver,WebElement locator,int timeout) {
				new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementSelectionStateToBe(locator, true));
		
				
	}
			WebElement myDynamicElement = (new WebDriverWait(driver1, 20))
					  .until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

}
