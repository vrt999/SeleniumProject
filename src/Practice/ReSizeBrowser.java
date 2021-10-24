package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class ReSizeBrowser {
 
    @Test	
    public void launchBrowser() {
    	System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.softwaretestingmaterial.com");
        System.out.println(driver.manage().window().getSize());
        //Create object of Dimensions class
        Dimension d = new Dimension(480,620);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);
        System.out.println(driver.manage().window().getSize());
     } 
}


