package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page_objects.LoginPageObject;

public class Reusable_test_components {
	WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		Properties pr= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\framework_intro\\src\\main\\java\\resources\\global_data.properties");
		pr.load(fis);
		String browserName= pr.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) 
		{ 
			 driver= new ChromeDriver();	
		}
		return driver;
	}
	public void launchandlogin() throws IOException
	{
		driver= initializeDriver();
		LoginPageObject lpo= new LoginPageObject(driver);
		lpo.launchapp();
		lpo.dologin("admin@123", "admin123");
		
	}
}
