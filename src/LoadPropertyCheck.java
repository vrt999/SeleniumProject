import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertyCheck {

	public static void main(String[] args) throws IOException {
		String fp = "F:\\myproject\\SeleniumProject\\src\\config.properties";
		FileInputStream fin = new FileInputStream(fp);
		
		Properties p = new Properties();
		p.load(fin);
		
		System.out.println("The Name value: " + p.getProperty("name"));
		
		System.out.println("The Age value: " + p.getProperty("age"));
		
	}

}
