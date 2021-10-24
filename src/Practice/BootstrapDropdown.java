package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BootstrapDropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		  Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		  
			    // Waiting 30 seconds for an element to be present on the page, checking
//				    .withTimeout(30, TimeUnit.SECONDS)
//
//				    // for its presence once every 5 seconds.
//				    .pollingEvery(5, TimeUnit.SECONDS)
//
//				    .ignoring(NoSuchElementException.class);
		  
	
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(2000);
		//Handling bootstrap dropdown checkboxes
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		for(int i=0;i<list.size();i++) {
			System.out.println("Drop down element"+i+" :" + list.get(i).getText());
			if(list.get(i).getText().contains("Python"))
			list.get(i).click();
		}
		driver.navigate().to("https://v4-alpha.getbootsrap.com/components/dropdowns/");
		
		List lastFiveCheckboxes= driver.findElements(By.xpath("//input[position() > last()-5]"));
	}

}
