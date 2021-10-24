package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePick {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\vrt999\\Desktop\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		WebElement x = driver.findElement(By.xpath("//input[@name = 'ctl00$mainContent$view_date2']//following-sibling::button[@class = 'ui-datepicker-trigger']"));
		System.out.println("x clickable: " + isClickable(x,driver));
		
		driver.findElement(By.xpath("//input[@name = 'ctl00$mainContent$view_date1']//following-sibling::button[@class = 'ui-datepicker-trigger']")).click();
		selectDate(driver);
		Set<String> handler = driver.getWindowHandles();	
		Iterator<String> it = handler.iterator();
		String parentwindowid = it.next();
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_view_date2']//following-sibling::button[@class = 'ui-datepicker-trigger']")).click();
		selectDate(driver);
		
	}
	public static void datePicker(WebDriver driver) {
		driver.findElement(By.xpath("//a[(@class = 'ui-state-default') and (text() = '10')]")).click();//ui-state-default ui-state-active
	}
	
	public static void selectDate(WebDriver driver) {
		String s1 = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();	
		String s2 = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
		
		String s = s1+s2;		
		//System.out.println("s1:" + s1 +"," + "s2:" + s2);		
		//System.out.println("Assertion date check? " + s.equalsIgnoreCase("June2018"));
		if(s.equalsIgnoreCase("October2018"))
		{
			System.out.println("s1:" + s1 +"," + "s2:" + s2);
			datePicker(driver);
		}
		else
		{	while(!(s.equalsIgnoreCase("October2018"))) {
			driver.findElement(By.xpath("//a[@class = 'ui-datepicker-next ui-corner-all']")).click();
			s1 = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();	
			s2 = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
			s = s1+s2;	}			
			System.out.println("s1:" + s1 +"," + "s2:" + s2);
			datePicker(driver);
		}
	}
		public static void selectDate2(WebDriver driver) {
			String s1 = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();	
			String s2 = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
			
			String s = s1+s2;		
			//System.out.println("s1:" + s1 +"," + "s2:" + s2);		
			//System.out.println("Assertion date check? " + s.equalsIgnoreCase("June2018"));
			if(s.equalsIgnoreCase("October2018"))
			{
				System.out.println("s1:" + s1 +"," + "s2:" + s2);
				datePicker(driver);
			}
			else
			{	while(!(s.equalsIgnoreCase("October2018"))) {
				driver.findElement(By.xpath("//a[@class = 'ui-datepicker-next ui-corner-all']")).click();
				s1 = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();	
				s2 = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
				s = s1+s2;	}			
				System.out.println("s1:" + s1 +"," + "s2:" + s2);
				datePicker(driver);
			}
	}
		public static boolean isClickable(WebElement webe,WebDriver driver)
		 
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
