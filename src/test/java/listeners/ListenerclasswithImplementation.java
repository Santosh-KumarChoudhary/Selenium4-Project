package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;




public class ListenerclasswithImplementation implements ITestListener{
	

	  public void onStart(ITestContext context) {
		    // not implemented
		  
		  System.out.println("Execution started");
		  
		  }

	  public void onTestStart(ITestResult result) {
		    // not implemented
		  
		  
		  System.out.println("Test started .....");
		  }

	  
	  public void onTestSuccess(ITestResult result) {
		  
		  
		  System.out.println("Test passed.....");
		    // not implemented
		  }
	  
	  public void onTestFailure(ITestResult result) {
		  
		  
		  System.out.println("Test failed....");
		    // not implemented
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		    // not implemented
		  
		  System.out.println("Test skipped.....");
		  }

}
