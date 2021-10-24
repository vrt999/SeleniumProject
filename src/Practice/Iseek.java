package Practice;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iseek {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vrt999\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://talentmarketplace.cognizant.com/HiringManager/Home/Dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("116237");
		driver.findElement(By.id("PasswordInternal")).sendKeys("Jan2019^");
		driver.findElement(By.id("Log_On1")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@class = 'pull-left active']//p[contains(text(),'Profiles')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("cdp-tab")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Location']")).click();
		List<WebElement> l = driver.findElements(By.xpath("//div[@class = 'locationdrop ng-scope ng-isolate-scope']//div//ul/li/a//span[@class = 'ng-binding']"));
		for(WebElement e : l) {
			if(e.getText().contains("Bangalore") || e.getText().contains("Hyderabad") || e.getText().contains("Chennai"))
				e.click();
		}
		driver.findElement(By.id("profiles-search-btn")).click();
		Thread.sleep(10000);
		
		//2nd  -  mCustomScrollBox mCS-dark mCSB_vertical mCSB_inside
		//1st - results-wrapper ng-scope ng-isolate-scope mCustomScrollbar _mCS_2
		
		//div[@class = 'mCSB_container']//div[@class = 'col-sm-12 col-md-6 col-lg-4 ng-scope'][30]
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class = 'mCSB_container']//div[@class = 'col-sm-12 col-md-6 col-lg-4 ng-scope']"));
		int profilecount = 0;
		Thread.sleep(3000);
		WebElement dragger = driver.findElement(By.id("mCSB_2_dragger_vertical"));
		WebElement dragpath = driver.findElement(By.id("mCSB_2_scrollbar_vertical"));
		Actions a = new Actions(driver);
/*		while(profilecount != l1.size()) {
			profilecount = l1.size();
			for(int i=0;i<=5000;i=i+500) {
				a.clickAndHold(dragger).moveToElement(dragpath).moveByOffset(0, 500).release().build().perform();
				Thread.sleep(2000);
			}
			l1 = driver.findElements(By.xpath("//div[@class = 'mCSB_container']//div[@class = 'col-sm-12 col-md-6 col-lg-4 ng-scope']"));	
		}
		System.out.println("The profile count from the list" + l1.size());
		System.out.println("The profile count value" + profilecount);	*/	
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<l1.size();i++) {
			int j = i+1;
			String s = "//div[@class = 'mCSB_container']//div[@class = 'col-sm-12 col-md-6 col-lg-4 ng-scope'][" + j + "]//p[@class = 'associate-name-id pull-left ng-binding']";
			WebElement e = driver.findElement(By.xpath(s));
			a.moveToElement(e).build().perform();
			al.add(e.getText());
		}
/*		for(WebElement ele:l1) {
			WebElement e = ele.findElement(By.xpath("//p[@class = 'associate-name-id pull-left ng-binding']"));
			a.moveToElement(e).build().perform();
			al.add(e.getText());
		}*/
		System.out.println("The names in the page: " + al);
		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet sh = w.createSheet("Profile Names");
		for(int i = 0;i<al.size();i++)
			sh.createRow(i).createCell(0).setCellValue(al.get(i));
		FileOutputStream o = new FileOutputStream(new File("C:\\Users\\vrt999\\Desktop\\data.xlsx"));
		w.write(o);
		
	}

}
