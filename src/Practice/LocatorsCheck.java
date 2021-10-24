package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCheck {
	
	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://onecognizant.cognizant.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		//By id
		driver.findElement(By.id("username"));
		//By classname
		driver.findElement(By.className("CTXMSAM_ContentFont userName"));
		
		//<input id="username" class="CTXMSAM_ContentFont userName" style="font-size: 8pt" type="text" title="User Id is Email Id" name="login" size="30" maxlength="127" onfocus="loginFieldCheck()" placeholder="Username">
		//By CSS selector using TAG and ID
		driver.findElement(By.cssSelector("input#username"));
		
		//By CSS selector using TAG and class
		driver.findElement(By.cssSelector("input.CTXMSAM_ContentFont userName"));
		
		//By CSS selector using TAG and Attribute value
		driver.findElement(By.cssSelector("input[title = User Id is Email Id]"));
		
		
		//By CSS selector using TAG,class and Attribute
		driver.findElement(By.cssSelector("input.CTXMSAM_ContentFont userName[title = User Id is Email Id]"));
		
		
		
//		div > span this only selects the span tag that is descendant not the span present inside one more different tag
		
//		If spaces are present in the class or id use '.' instead of spaces
		
//		div span selects the span even inside a different tag under div
//		div+span selects only the immediate first sibling span that is immediate to div tag(single line)
//		div~span selects all the span tag that is immediate to div tag(single line)
//		span[class] selects all the span tags that has class attribute
//		X[href="foo"] exact equal to foo
//		X[href*="foo"] contains foo
//		X[href^="foo"] starting with foo
//		X[href$="foo"] ends with foo
//		a[title ~= 'for more'] doesn't retrieve any element(cannot be used for value with spaces)
//		a[title *= 'for more'] works for the spaces too
//		X:nth-child(n) - counts from start
//		X:nth-last-child(n)- count from end
//		X:nth-of-type(n) - same as above
//		X:nth-last-of-type(n)
//		X:first-child
//		X:last-child
//		X:only-child
//		X:only-of-type
//		X:first-of-type(n)
		
//		for reference - https://www.w3schools.com/cssref/css_selectors.asp
		
/*
		<div>
		   <p> My paragraph here. </p>
		   <ul>
		      <li> List Item 1 </li>
		      <li> List Item 2 </li>
		   </ul>
		 
		   <ul>
		      <li> List Item 3 </li>
		      <li> List Item 4 </li>
		   </ul>   
		</div>
	ul:first-of-type > li:nth-child(2)
	p + ul li:last-child
	ul:first-of-type li:nth-last-child(1)	
	
*/		
		
		
//		Xpath Locator:
			//span[text() = 'scrollHeight']/..//following-sibling::p//preceding-sibling::div//parent::div//child::div//ancestor::div//descendant::a
		
		//input[starts-with(@id , 'fakebox')]
		//a[contains(text(),'pyth')][starts-with(@class ,'ga-tag-') ]
		//a[contains(text(),'pyth') and starts-with(@class ,'ga-tag-') ]
		//a[contains(text(),'pyth') or starts-with(@class ,'ga-tag-') ]
		
// java Script locator using xpath for finding the element text
		//String s = "return document.getElementByXpath('"+xpath"').value;";
		//String text = (String)js.executeScript(s);
		
// perform click on the element using java script
//		js.executeScript("arguments[0].click();",ele);
		
//		js.executeScript("return document.readyState;");

	}

}
