package ListnersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListner implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases Success and details are"+result.getName());
		
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases Failure and details are"+result.getName());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases Skipped and details are"+result.getName());
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TestCases Failed ButWithinSuccessPercentage and details are"+result.getName());
		
		
	}

	public void onStart(ITestContext result) {
		System.out.println("TestCases OnStart and details are"+result.getName());
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
