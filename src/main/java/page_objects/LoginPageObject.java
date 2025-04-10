package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
        
	
	WebDriver driver;
	
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void dologin() {
		WebElement email= driver.findElement(By.id("email"));
		WebElement pass= driver.findElement(By.id("pass"));
		WebElement lgbutton= driver.findElement(By.name("login"));
		email.sendKeys("admin@123");
		pass.sendKeys("admin123");
		lgbutton.click();
	}
	public void launchapp() {
		driver.get("https://www.facebook.com/");
	}
	public void lauchandlogin() {
		driver.get("https://www.facebook.com/");
		WebElement email= driver.findElement(By.id("email"));
		WebElement pass= driver.findElement(By.id("pass"));
		WebElement lgbutton= driver.findElement(By.name("login"));
		email.sendKeys("admin@123");
		pass.sendKeys("admin123");
		lgbutton.click();
	}
	
	
}

