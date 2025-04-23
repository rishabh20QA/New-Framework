package listeners_pack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerner implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Hello i m started");
		
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("hello i got successfully executed");
		
	}
	
	

}
