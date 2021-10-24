package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// HTML Unit Driver isn't available after selenium 3.x (only present as JARs)
		// To USe it before 3.x v need to download the JAR
		// Also called ghost driver or headless browser
			//-- HTMUnitDriver for Java
			//--phantomjs for Java script
//		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://onecognizant.cognizant.com");
		Thread.sleep(2000);
		

	}

}
