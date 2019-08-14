package Android_SoftApp;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import iOS_SoftApp.JUnitTestReporter;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

	public class AndroidSoft_OrientationTest extends JUnitTestReporter {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "SoftApp.Android.StartSess.EndSess";
    protected static AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability("deviceName", "android");
      //  dc.setCapability(MobileCapabilityType.UDID, "33002fd9d2b41353");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.route1.mobi.android");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.LaunchingActivity");
        dc.setCapability(MobileCapabilityType.NO_RESET, true);
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.WARNING);
    }


        
    @Test

    public void testSoftApp_Android_StartSess_EndSess() {
    	//Login page
    	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='Login']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
        //Host List
        driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
        
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Online']")));
        driver.findElement(By.xpath("//*[@text='Online']")).click();
        
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='close_button']")));
        //Data Session - No Keyboard
        driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
        
        driver.getKeyboard();
        //Data session - with keyboard
        driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	
        driver.findElement(By.xpath("//*[@id='close_button']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Yes']")));
        driver.findElement(By.xpath("//*[@text='Yes']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Online']")));
        driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    }

    @After
    public void tearDown() {
        driver.closeApp();
    }
}
