package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

interface At1 {
	public void methodA();
}

interface At2 {
	public void screenShot();
	public void methodA();
}

class Bat implements At1,At2 {
	public void methodA() {
		System.out.println("B class - methodA");
	}
	
	public void methodB() {
		System.out.println("B class - methodB");
	}
	
	public void screenShot() {
		System.out.println("B class - methodscreenShot");
	}
	
}

class Cat extends Bat {
	public void methodA() {
		System.out.println("C class - methodA");
	}
	
	public void methodB() {
		System.out.println("C class - methodB");
	}
	
	public void methodC() {
		System.out.println("C class - methodC");
	}
}

class Don extends Bat {
	public void methodA() {
		System.out.println("D class - methodA");
	}

}


public class SeleniumClassHierarchy {
	
	public static void main(String... args) {	
//	At1 aC = new Cat();
//	aC.methodC(); throws error method undefined
//	aC.methodB(); throws error method undefined
//	aC.methodA();// "C class - methodA" - if methodA in C isnot there then it gives output as "B class - methodA" if Cat methodA is not present else "C class - methodA"
//	At1 bA = new Bat();	
//	bA.methodA();
	
	At1 cat1 = new Cat();
	cat1.methodA();
	At2 cat2 = (At2)cat1;
	
	cat2.methodA();
	cat2.screenShot();
	
	At2 cat3 = new Cat();
	
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js = new ChromeDriver();
	
	TakesScreenshot ts = new ChromeDriver();
	

	
	
	
	
	

	
	
	
	
	}

}
