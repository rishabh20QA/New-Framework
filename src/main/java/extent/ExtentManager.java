package extent;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	public static ExtentReports extent;
	public static ExtentReports getExtentReports() 
	{
		if(extent==null) 
		{
			String reportpath=System.getProperty("user.dir") + "/reports/extent-report.html";
			File reportsFolder= new File(System.getProperty("user.dir") + "/reports");
			
			if(!reportsFolder.exists()) 
			{
				reportsFolder.mkdirs();
			}
			ExtentSparkReporter reporter= new ExtentSparkReporter(reportpath);
			reporter.config().setReportName("Automation Test Result");
			reporter.config().setDocumentTitle("Test report");
			extent= new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("tester","rishabh");
			}
		    return extent;
	}

}
