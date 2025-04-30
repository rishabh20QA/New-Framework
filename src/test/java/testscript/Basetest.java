package testscript;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page_objects.LoginPageObject;

public class Basetest extends Reusable_test_components{
	@Test (enabled= false ,dataProvider="excelData" )
	
     public void tc01(String unName, String unPass) 
	{
		
		System.out.println(unName + " "+ unPass);
		
    	
     }
	@DataProvider(name="excelData")
	public Object[][] getExcelData() throws IOException
	{
		String filepath="C:\\Users\\ADMIN\\Desktop\\Codes\\MyCSV.xlsx";
		String sheetname= "MySheet";
		
		return Excel_util.readExcelData(filepath, sheetname);
	}
	@Test
	public void tc02() 
	{
		Assert.assertTrue(true);
	}
	@Test
	public void tc03() 
	{
		Assert.assertTrue(false);
	}
	
	
	
	
	}



