package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable_abstract_component.Abstract_component;

public class LoginPageObject extends Abstract_component {
        
	
	WebDriver driver;
	
	
	public LoginPageObject(WebDriver driver) {
		super(driver);
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// page factory annotation
	@FindBy(id="email") WebElement un;
	@FindBy(id="pass") WebElement pas;
	@FindBy(name="login") WebElement lgbutton;
	
	public void dologin(String username, String password) {
		un.sendKeys(username);
		pas.sendKeys(password);
		lgbutton.click();
		close();
		}
	public void launchapp() {
		
		
		driver.get("https://www.facebook.com/");
		max();
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

