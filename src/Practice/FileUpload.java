package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	public static void main(String args[]) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://onecognizant.cognizant.com");
		Thread.sleep(2000);
		
		WebElement e = driver.findElement(By.xpath("//input[@id = 'btnsearch']"));
		
		Actions action= new Actions(driver); 
		action.contextClick(e).sendKeys(Keys.DOWN);
		
		
		
		// never use click on browse to upload files, type = 'file' should be preset on the tags for browse/upload
		
		driver.findElement(By.xpath("//input[@id = 'btnsearch']")).sendKeys("C:\\Users\\vrt999\\Desktop\\chromedriver.docx");
		
		
	}
}
