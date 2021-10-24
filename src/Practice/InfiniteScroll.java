package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://scrollmagic.io/examples/advanced/infinite_scrolling.html");
		Thread.sleep(5000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
/*		Long x = (Long)js.executeScript("return document.documentElement.scrollHeight;");
		Long y = (Long)js.executeScript("return document.body.scrollHeight;");
		Long z = (Long)js.executeScript("return document.documentElement.clientHeight;");
		System.out.println("Intial documentElement scroll Height: " + x);
		System.out.println("Intial body scroll Height: " + y);
		System.out.println("Intial documentElement client Height: " + z);
		js.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
		Thread.sleep(5000);
		Long p = (Long)js.executeScript("return document.documentElement.scrollHeight;");
		Long q = (Long)js.executeScript("return document.body.scrollHeight;");
		Long r = (Long)js.executeScript("return document.documentElement.clientHeight;");
		System.out.println("Intial documentElement scroll Height: " + p);
		System.out.println("Intial body scroll Height: " + q);
		System.out.println("Intial documentElement client Height: " + r);*/
		
		Long x = (Long)js.executeScript("return document.documentElement.scrollHeight;");
		
		do{
			System.out.println(" The length of the DOM: " + x);
			x = (Long)js.executeScript("return document.documentElement.scrollHeight;");
			js.executeScript("window.scrollBy(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
			Thread.sleep(2000);
//		}while(x < (Long)js.executeScript("return document.documentElement.scrollHeight;"));
		}while(x < 5000);
		
		System.out.println("**********Scroll ended**********");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-1000)");
		
//		js.executeScript("window.scrollTo(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight),0);");
		
		System.out.println("**********Scroll to Top ended**********");
		
		Thread.sleep(5000);
	}

}
