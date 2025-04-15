package testscript;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_objects.LoginPageObject;

public class Basetest {
	@Test
     public void tc01(){
    	 WebDriver driver = new ChromeDriver();
    	 
    	 LoginPageObject lpo= new LoginPageObject(driver);
    	 lpo.launchapp();
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the email:");
    	 String s= sc.nextLine();
    	 System.out.println("Enter the pass:");
    	 String a= sc.nextLine();
    	 lpo.dologin(s,a);
    	 
     }
	}


