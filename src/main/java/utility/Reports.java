package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports CreateReport(){
	ExtentReports reports=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReport.html");
	reports.attachReporter(spark);
	reports.setSystemInfo("Created By", "Bharat");
	reports.setSystemInfo("Test suit", "Regression");
	return reports;
	}
	
}
