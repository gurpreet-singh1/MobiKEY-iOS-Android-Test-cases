package Android_SoftApp;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import iOS_SoftApp.JUnitTestReporter;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.AllTests;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;



public class AndroidSoft_Registration extends JUnitTestReporter {
	
	public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AllTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
	
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    
    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
       // dc.setCapability(MobileCapabilityType.UDID, "33002fd9d2b41353");
        dc.setCapability("deviceName", "Android");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.route1.mobi.android");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.LaunchingActivity");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='Login']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_settings']")));
        driver.findElement(By.xpath("//*[@id='menu_settings']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Troubleshooting']]")).click();
        driver.findElement(By.xpath("//*[@text='Reset Configuration']")).click();
        driver.findElement(By.xpath("//*[@text='Continue']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mobinet_username']")));
        driver.findElement(By.xpath("//*[@id='mobinet_username']")).sendKeys("yyyyyyyy");
        driver.findElement(By.xpath("//*[@id='mobinet_user_password']")).sendKeys("yyyyyyyy");
        driver.findElement(By.xpath("//*[@text='>']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='>']")));
        driver.findElement(By.xpath("//*[@text='>']")).click();
        driver.findElement(By.xpath("//*[@id='mobinet_password']")).sendKeys("Route123");
        driver.findElement(By.xpath("//*[@id='retype_password']")).sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='>']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}