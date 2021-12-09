package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {

	public static void main(String[] args) {
		// Blank HTML
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html");

		// report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);

		ExtentTest test = extent.createTest("TC001-Login Page");
		test.assignAuthor("Prasanth");
		test.assignCategory("Smoke");
		test.pass("Enter the URL");
		test.pass("Enter UserName and Password");
		test.pass("Click on login button");
		test.fail("Failed login", MediaEntityBuilder.createScreenCaptureFromPath("drag.png").build());

		ExtentTest test1 = extent.createTest("TC002-My Page");

		test1.pass("Enter the URL");
		test1.pass("Enter UserName and Password");
		test1.pass("Click on login button");

		extent.flush();

	}

}
