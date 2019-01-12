package extent;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test01 {

	public static void main(String[] args) throws InterruptedException {
		//Vikash Branch
		ExtentReports extent=new ExtentReports(System.getProperty("user.dir")+"\\Output\\extent.html",true);
		extent.addSystemInfo("Browser","Chrome").addSystemInfo("Environment","QA").addSystemInfo("Tester","Vikash");
		File configFile=new File(System.getProperty("user.dir")+"\\ReportConfig\\ReportsConfig.xml");
		extent.loadConfig(configFile);
		ExtentTest extentlog;
		extentlog=extent.startTest("Test Case1");
		extentlog.log(LogStatus.PASS, "Test Case 1 Passed");
		extentlog=extent.startTest("Test Case2");
		extentlog.log(LogStatus.FAIL, "Test Case 2 Failed");
		extentlog=extent.startTest("Test Case3");
		extentlog.log(LogStatus.SKIP, "Test Case 3 Failed");
		extent.endTest(extentlog);		
		extent.flush();
		//extent.close();

	}

}
