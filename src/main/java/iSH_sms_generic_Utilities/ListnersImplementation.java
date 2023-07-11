package iSH_sms_generic_Utilities;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import zmq.ZError.IOException;

public  class ListnersImplementation implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailure(ITestResult result) {
		String methodName= result.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		LocalDateTime dt = LocalDateTime.now();
		String dateTime = dt.toString().replace(" ","_").replace(":", "_");
		File dst = new File("./Screenshots/"+methodName+" "+dateTime+".png");
		
			try {
				FileUtils.copyFile(src, dst);
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}


	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
