package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SrollingDiv {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\vrt999\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mdbootstrap.com/docs/jquery/javascript/scroll/");
		Thread.sleep(5000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);	
		
		WebElement e = driver.findElement(By.xpath("//button[contains(text(),'No')]"));
		e.click();
		
//		WebElement e1 = driver.findElement(By.xpath("//section[@id = 'section-basic-example']//div[@class = 'ps__thumb-x']"));
		WebElement e1 = driver.findElement(By.xpath("//div[@id = 'js-box']"));
		WebElement e2 = driver.findElement(By.xpath("//div[@id = 'js-box']//ancestor::body//a[@id = 'html-link']"));		
		js.executeScript("arguments[0].scrollIntoView(true);", e2);
		Thread.sleep(5000);
//		js.executeScript("arguments[0].scrollTop = 240;", e1);
		Actions a = new Actions(driver);
		a.clickAndHold(e1).moveByOffset(138, 0).release().build().perform();
//		js.executeScript("document.querySelector('section#section-basic-example div.ps__rail-x').scrollLeft=240");	
		Thread.sleep(5000);
////		WebElement e1 = driver.findElement(By.cssSelector("section#smooth-scroll div.tab-pane.fade.active.show span:nth-child(60)"));
//		Actions a = new Actions(driver);
////		a.moveToElement(e1).build().perform();
//		
//		
//		//Scrolling inner scrollbars
//		WebElement e2 = driver.findElement(By.cssSelector("div.scrollbar.scrollbar-primary"));		
//		a.moveToElement(e2).build().perform();		
//		Thread.sleep(2000);		
//		js.executeScript("document.querySelector('div.scrollbar.scrollbar-primary').scrollTop=150");		
//		Thread.sleep(2000);		
//		js.executeScript("document.querySelector('div.scrollbar.scrollbar-primary').scrollTop=0");		
//		Thread.sleep(2000);	
//		js.executeScript("document.querySelector('div.scrollbar.scrollbar-secondary').scrollTop=150");		
//		Thread.sleep(2000);		
//		js.executeScript("document.querySelector('div.scrollbar.scrollbar-default').scrollTop=150");
//		Thread.sleep(2000);
//		//Scrolling image
//		WebElement e3 = driver.findElement(By.cssSelector("section.mb-5 div.my-custom-scrollbar"));		
//		a.moveToElement(e3).build().perform();
//		Thread.sleep(5000);		
//		WebElement hbar = driver.findElement(By.cssSelector("section.mb-5 div.ps__thumb-x"));
////		WebElement hpath = driver.findElement(By.cssSelector("section.mb-5 div.ps__thumb-x"));		
//		a.clickAndHold(hbar).moveByOffset(300, 0).release().build().perform();
//		Thread.sleep(5000);
//		WebElement vbar = driver.findElement(By.cssSelector("section.mb-5 div.ps__thumb-y"));
//		a.clickAndHold(vbar).moveByOffset(0,300).release().build().perform();		
//		Thread.sleep(5000);
//		
//		//scroll code working		
//		WebElement e5 = driver.findElement(By.cssSelector("div#test1 h3"));
//		a.moveToElement(e5).build().perform();	
//		Thread.sleep(3000);
//		js.executeScript("document.querySelector('section#smooth-scroll pre.grey.lighten-3.px-3.mb-0.line-numbers.language-html').scrollTop=450");
//		Thread.sleep(3000);
//		
//		//Scroll div elements
//		WebElement e4 = driver.findElement(By.cssSelector("section#cards ul.nav.md-pills.pills-grey"));		
//		a.moveToElement(e4).build().perform();		
//		driver.findElement(By.cssSelector("button#modal-bf-no")).click();
//		Thread.sleep(3000);
//		js.executeScript("document.querySelector('div.card.example-1.scrollbar-ripe-malinka').scrollTop=500");
//		Thread.sleep(3000);
//		js.executeScript("document.querySelector('div.card.example-1.square.scrollbar-cyan.bordered-cyan').scrollTop=500");
//		Thread.sleep(3000);
//		js.executeScript("document.querySelector('div.card.example-1.scrollbar-deep-purple.bordered-deep-purple.thin').scrollTop=500");
//		Thread.sleep(3000);
//		js.executeScript("document.querySelector('div.card.example-1.square.scrollbar-dusty-grass.square.thin').scrollTop=500");
//		
//		//Scrolling forms
//		driver.findElement(By.cssSelector("a[href='#forms']")).click();
//		Thread.sleep(3000);
//		js.executeScript("document.querySelector('section.form-elegant.scrollbar-light-blue').scrollTop=500");
//		Thread.sleep(3000);
//		js.executeScript("document.querySelector('section.form-dark.scrollbar-dusty-grass.thin.square').scrollTop=500");
//		
////		taskkill /F /IM iexplore.exe /T
//	
//		
//		
//		
//		//below code works fine for div scroll
///*		driver.get("http://demo.automationtesting.in/WebTable.html");
//		WebElement sel = driver.findElement(By.cssSelector("select.ng-pristine"));
//		Select s = new Select(sel);
//		s.selectByVisibleText("30");		
//		Thread.sleep(5000);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		Long x = (Long)js.executeScript("return document.querySelector('div.ui-grid-viewport').scrollHeight;");
//		System.out.println("The scroll height of first div:" + x);
//		EventFiringWebDriver ew = new EventFiringWebDriver(driver);
//		ew.executeScript("document.querySelector('div.ui-grid-viewport').scrollTop=500");
//		
//		Long y = (Long)js.executeScript("return document.querySelector('div.ui-grid-viewport').scrollTop;");
//		System.out.println("The scroll Top of first div:" + y);*/
		
		driver.quit();


	}

}
