package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//select[@name = 'country']"));
		Select s = new Select(e);
		s.selectByValue("ANGOLA");
		List<WebElement> l = s.getAllSelectedOptions();
		System.out.println("The dropdown elements are:\n");
		for(WebElement ele:l) {
			System.out.println(ele.getText());
		}
		
		List<WebElement> al = s.getOptions();
		System.out.println("The dropdown elements are:\n");
		for(WebElement ele:al) {
			System.out.println(ele.getText());
		}
		
		
	}

}
