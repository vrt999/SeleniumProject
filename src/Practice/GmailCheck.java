package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailCheck {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\vrt999\\Desktop\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("ravi4a4@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("vrt_9999");
		driver.findElement(By.xpath("//div[contains(@class,'O0WRkf ')]")).click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		WebElement e = driver.findElement(By.xpath("//div[contains(@class,'ajl aib aZ6')]"));
		WebElement e1 = driver.findElement(By.xpath("//span[text() = 'More']"));
		WebElement e2 = driver.findElement(By.xpath("//span[@class = 'bog']//span[contains(text(),'ORDER DETAIL #LXB15290')]"));
//		WebDriverWait wait = new WebDriverWait(driver,60);
//		wait.until(ExpectedConditions.visibilityOf(e));
/*		System.out.println("Element Displayed :" + driver.findElement(By.xpath("//div[@class = 'ar6 T-I-J3 J-J5-Ji']")).isDisplayed());
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//div[@class = 'ar6 T-I-J3 J-J5-Ji']")).click();
		driver.findElement(By.xpath("//span[@name = 'TransferWise']//parent::div/parent::td/preceding-sibling::td[@class = 'oZ-x3 xY']/descendant::div[@class = 'T-Jo-auh']")).click();*/
		
		try
	    {               
	        Actions dragger = new Actions(driver);
	        // drag downwards
//	        dragger.moveToElement(webelement).clickAndHold().moveByOffset(0, numberOfPixelsToDragTheScrollbarDown).release(webelement).build().perform();
        
//	            dragger.moveToElement(e).click().keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	        dragger.moveToElement(e1).build().perform();
	        
	        Thread.sleep(3000);
	        dragger.moveToElement(e2).build().perform();
		    }
	    catch (Exception exp)
	    {
	        exp.printStackTrace();
	    }
	
		System.out.println("The scroll is done");
		

	}

}
