package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromePopUp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()= 'Good PopUp #3']")).click();
		driver.findElement(By.xpath("//a[text()= 'Good PopUp #2']")).click();
		driver.findElement(By.xpath("//a[text()= 'Good PopUp #4']")).click();
		driver.findElement(By.xpath("//a[text()= 'Good PopUp #1']")).click();
		Set<String> l = driver.getWindowHandles();
		Iterator<String> it = l.iterator();
		String parent = it.next();
		String c3 = it.next();
		String c2 = it.next();
		String c4 = it.next();
		String c1 = it.next();
		System.out.println("Parent window ID: " + parent);
		System.out.println("Child c3 window ID: " + c3);
		System.out.println("Child c2 window ID: " + c2);
		System.out.println("Child c4 window ID: " + c4);
		System.out.println("Child c1 window ID: " + c1);
		System.out.println("Windows count: " + l.size());
		Thread.sleep(10000);
		driver.switchTo().window(c2);
		driver.close();
		driver.switchTo().window(parent);
		

	}

}
