package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BrowserWindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]"));
		
		e.click();
		
		Set<String> handler = driver.getWindowHandles();	
		
		Iterator<String> it = handler.iterator();
		
		String parentwindowid = it.next();
		
		String childwindowid = it.next();
		
		driver.switchTo().window(childwindowid);
		
		System.out.println("Child window title" + driver.getCurrentUrl());		
		
		driver.close();
		
		driver.switchTo().window(parentwindowid); 
		
		System.out.println("parent window title" + driver.getCurrentUrl());	
		

	}

}
