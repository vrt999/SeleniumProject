package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://onecognizant.cognizant.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("455504");
		driver.findElement(By.xpath("//input[@id = 'PasswordInternal']")).sendKeys("may-2018");
		WebElement loginBtn = driver.findElement(By.id("Log_On1"));
		// flash element
		flash(loginBtn, driver); 
		//draw border
		drawBorder(loginBtn, driver);
		
		// Take screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("F:\\myproject\\SeleniumProject\\src\\Practice\\check.png"));
		//generate alert
		//generateAlert(driver,"There is an issue with login button");
		
		//click an element
		clickElementByJS(loginBtn,driver);
		
		//refresh the page 
		// method 1 with selenium
		driver.navigate().refresh();
		//method 2 with JS
		RefreshBrowserByJS(driver);
		
		//get Page Title BY JS
		System.out.println("The page title by JS" + getTitleByJS(driver));
		
		//getPage Innertext
		System.out.println("The page Inner text by JS" + getPageInnerTextByJS(driver));
		
		//Scroll page down
		scrollPageDownByJS(driver);
		
		//Scroll to element
		scrollIntoview(loginBtn,driver);
		
		
			}
	// Flash the element
	public static void flash( WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0; i< 10;i++) {
			changeColor("rgb(400,0,0)",element,driver);
			changeColor(bgcolor,element,driver);
			((WebDriver) js).close();
		}
			
	}
	
	
	public static void changeColor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
		try{Thread.sleep(40);}
		catch(InterruptedException e) {}
				
		}
	// Drawborder for the Element
	public static void drawBorder(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'",element);
	}
	
	// Generate Alert if there is an issue with the element
	public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void RefreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String titleByJS = js.executeScript("return document.title;").toString();
		return titleByJS;
	}
		
	public static String getPageInnerTextByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageInnerTextByJS = js.executeScript("return document.documentElement.innerText;").toString();
		return pageInnerTextByJS;		
		}
	public static void scrollPageDownByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollIntoview(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("aruments[0].scrollIntoView(true);",element);
	}
	}


