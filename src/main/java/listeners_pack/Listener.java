package listeners_pack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extent.ExtentManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Listener implements ITestListener{
	private static ExtentReports extent;
	private static ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		extent = ExtentManager.getExtentReports();
		
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		test= extent.createTest(result.getMethod().getMethodName());
	
	
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, "test case passed");
		
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{  
		
		test.log(Status.FAIL, "test case failed");
	}
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
		
	}
	
	

}
