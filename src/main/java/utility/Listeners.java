package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener{

	public void OnTestStart(ITestResult result) {
		
	}
	
	public void OnTestSuccess(ITestResult result) {
		
	}
	public void OnTestFailure(ITestResult result) {
	try {
		Screenshot.ClickScreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	public void OnTestSkipped(ITestResult result) {
		
	}
	
	
}
