package Practice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.regexp.recompile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotToWord {


public void WordDoc() throws InvalidFormatException, FileNotFoundException, IOException
{
XWPFDocument doc=new XWPFDocument();
XWPFParagraph p=doc.createParagraph();
XWPFRun r=p.createRun();

System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrt999\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("F:\\Selenium\\Selenium\\ss\\ss1.png"));
String img="ss1";
FileInputStream pic = new FileInputStream("F:\\Selenium\\Selenium\\ss\\ss1.png");

r.addBreak();
r.setText("image file");
r.addPicture(pic, XWPFDocument.PICTURE_TYPE_PNG,"F:\\Selenium\\Selenium\\ss\\ss1.png" , Units.toEMU(200), Units.toEMU(200));

FileOutputStream out = new FileOutputStream("F:\\Selenium\\Selenium\\ss\\images.docx");
doc.write(out);
out.close();
} 


	public static void main(String[] args) throws InvalidFormatException, IOException {
		ScreenShotToWord s = new ScreenShotToWord();		
		s.WordDoc();

	}

}
