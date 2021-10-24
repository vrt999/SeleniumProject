package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.xpath("//a[@id = 'check']"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//element click
		js.executeScript("arguments[0].click();",element);
		//page Refresh
		js.executeScript("history.go(0)");
		//highlight element
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
		//page text
		js.executeScript("return document.documentElement.innerText;").toString();
		// scroll pagedown
		js.executeScript("window.scrollTo(0,document.body.scrollHeight");
		//Scroll to view an element
		js.executeScript("arguments[0].scrollToView(true)", element);
		
		
		

	}

}
