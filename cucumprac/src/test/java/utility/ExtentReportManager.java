package utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class ExtentReportManager {
	    private static ExtentReports extent;
	    //private static ExtentTest test;
	    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	    public static ExtentReports getInstance() {
	        if (extent == null) {
	            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
	            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
	            extent = new ExtentReports();
	            extent.attachReporter(spark);
	        }
	        return extent;
	    }

	    public static void flush() {
	        if (extent != null) {
	            extent.flush();
	        }
	    }
	


}
