package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriverClass {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\vrt999\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		String s = driver.findElement(By.xpath("//div[@class = 'mbs _52lq fsl fwb fcb']")).getAttribute("innerHTML");		
		System.out.println("The innerHTML: " + s);
		
		String s1 = driver.findElement(By.xpath("//div[@class = 'mbs _52lq fsl fwb fcb']")).getAttribute("innerText");		
		System.out.println("The innerText: " + s1);
		
		String s2 = driver.findElement(By.xpath("//div[@class = 'mbs _52lq fsl fwb fcb']")).getAttribute("value");		
		System.out.println("The innerText: " + s2);
		
		String s3 = driver.findElement(By.xpath("//div[@class = 'mbs _52lq fsl fwb fcb']")).getText();		
		System.out.println("The innerText: " + s3);
		

	}

}
