package Practice;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OneCSignIn {

	public static void main(String[] args) throws InterruptedException,IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://onecognizant.cognizant.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Log_On1")).click();
		Thread.sleep(2000);
		//Handle popups
		Alert check = driver.switchTo().alert();
		check.accept();
		
//		driver.findElement(By.cssSelector("#username")).sendKeys("455504");
//		driver.findElement(By.cssSelector("#PasswordInternal")).sendKeys("mar-2018");
//		driver.findElement(By.cssSelector("#Log_On1")).click();
		
		driver.findElement(By.id("username")).sendKeys("455504");
		driver.findElement(By.id("PasswordInternal")).sendKeys("mar-2018");
		driver.findElement(By.id("Log_On1")).click();
//	Alert alert = driver.switchTo().alert();
//	driver.findElement(By.id("closeBtn")).click();
		
		Thread.sleep(3000);
//		List <WebElement> counter = driver.findElements(By.tagName("iframe"));
//		
//		System.out.println("count = " + counter.size());
		
		//appFrame
		//socialframe
		//subFrame
		//cross-domain-store-server-iframe
//		li Tag liPromoIcon - id
		
		driver.findElement(By.id("txtPlatformBarSearch")).sendKeys("Submit Timesheet");
		driver.findElement(By.xpath("//input[@id = 'btnsearch']")).click();		
		driver.switchTo().frame("appFrame");
		Thread.sleep(2000);
		Actions action = new Actions(driver);//
		action.moveToElement(driver.findElement(By.xpath("//div[@class = 'inActive']//h3[(text()='Submit Timesheet')]"))).build().perform();
		//*[@id='desktopsearchresult']/ul/li[1]/div[1]
		//*[@id='desktopsearchresult']/ul/li[1]/div[2]/p
		driver.findElement(By.xpath("//div[@class = 'acitveContent']//p[contains(text(),'The app is a system invoked app that')]")).click();
	}

}
