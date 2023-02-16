package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	public void onTestSuccess(ITestResult result) {
		 System.out.println("Test-pass");
	 }
	 
	public void onTestFailure(ITestResult result) {
		 System.out.println("Test-fail");
	 }
	 
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Test-skip");
	 }
	 
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 System.out.println("Test-skipped");
	 }
	 
	 public void onStart(ITestContext result) {
		 System.out.println("before test everything");
	 }
	 
	 public void onFinish(ITestContext result) {
		 System.out.println("after test everything");
	 }

}
