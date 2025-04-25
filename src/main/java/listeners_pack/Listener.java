package listeners_pack;

import org.testng.ITestListener;
import org.testng.ITestResult;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Listener implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Hello i m started");
		
		
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("hello i got successfully executed");
		
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{  System.out.println(result.getMethod().getMethodName());
		
		System.out.println(result.getThrowable());
		System.out.println("hello i got failed");
	}
	
	
	

}
