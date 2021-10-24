package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream it = new FileInputStream("F:\\myproject\\SeleniumProject\\src\\Practice\\config.properties");
		prop.load(it);
		System.out.println("Printing Name from properties file: " + prop.getProperty("name"));
		
		// # symbol comments the attribute in the property file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Url"));
				
	}

}
