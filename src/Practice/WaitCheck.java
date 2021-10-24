package Practice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;



public class WaitCheck {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\vrt999\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		WebElement e = driver.findElement(By.xpath("//button[contains(text(),'start timer')]"));
		e.click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'start timer')]")));
		wait.ignoring(Exception.class);		
		Function<WebDriver,WebElement> funB = new Function<WebDriver,WebElement>(){

			@Override
			public WebElement apply(WebDriver driver) {
				
				WebElement e2 = driver.findElement(By.xpath("//p[@id='demo']"));
				
				String eletext = e2.getAttribute("innerHTML");
				
				if(eletext.equalsIgnoreCase("WebDriver")) {					
					System.out.println("The element text is equal to WebDriver");
					return e2;					
				}
				else {					
					System.out.println("The Default value is considered");
					return null;					
				}
				// TODO Auto-generated method stub
				
			}};
		
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver)
				.withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		
		
		WebElement e1 = w.until(funB);
		
		System.out.println("The element e1 text is : " + e1.getText());
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()
		

		

	}

}
