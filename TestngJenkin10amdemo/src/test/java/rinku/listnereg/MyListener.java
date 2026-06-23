package rinku.listnereg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class MyListener implements ITestListener {
	
	
	
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Call before test case");
		
		
        
        
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
	   System.out.println("after sucess");		
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("after fail");
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("on skip");
		
			}
	
	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("on start class");
		}
	
	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("on end");
	}


}
