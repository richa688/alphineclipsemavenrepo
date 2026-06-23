package rinku.listnereg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportEg {

    public static ExtentReports extent;
    public static ExtentSparkReporter spark;

    // ✅ STEP 1 — Runs ONCE before all test methods in this class
    @BeforeClass
    void setup() {
        spark = new ExtentSparkReporter("test-output/testreport/myreport.html");

        extent = new ExtentReports();
        
        extent.setSystemInfo("Project Name", "Google Search Automation");
        extent.setSystemInfo("Tester", "Trainer Name");
        extent.setSystemInfo("Environment", "QA");

        extent.attachReporter(spark);

        System.out.println("=== Report Setup Done ===");
    }

    // ✅ STEP 3 — Runs ONCE after ALL test methods are finished
    // flush() writes all logged data into the HTML file
    @AfterClass
    void teardown() {
        extent.flush();  // ← Without this, HTML file will NOT be created
        System.out.println("=== Report Flushed & Saved ===");
    }

    // ✅ STEP 2 — These 3 tests run in between @BeforeClass and @AfterClass

    @Test
    void test1() {
        ExtentTest test = extent.createTest("Pass TestCase");
        System.out.println("Running test1");
        test.log(Status.INFO, "start testcase1"); 
        test.log(Status.INFO, "running testcase1");
        Assert.assertTrue(true);
        
        test.log(Status.PASS, "Assert passed successfully");
        test.log(Status.INFO, "End testcase1");
    }

    @Test
    void test2() {
        ExtentTest test = extent.createTest("Fail TestCase");
        System.out.println("Running test2");
        try {
            Assert.assertTrue(false);
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Assert failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    void test3() {
        ExtentTest test = extent.createTest("Skip TestCase");
        System.out.println("Running test3");
        test.log(Status.SKIP, "Test skipped intentionally");
        throw new SkipException("Skipping this test");
    }
}