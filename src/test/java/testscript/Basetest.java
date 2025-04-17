package testscript;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_objects.LoginPageObject;

public class Basetest extends Reusable_test_components{
	@Test
     public void tc01() throws IOException{
		launchandlogin();
    	
     }
	}


