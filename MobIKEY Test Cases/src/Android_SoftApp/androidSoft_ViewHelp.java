package Android_SoftApp;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import iOS_SoftApp.JUnitTestReporter;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

	public class androidSoft_ViewHelp extends JUnitTestReporter {
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
    	//
    	driver.findElement(By.xpath("//*[@id='menu_help_login']")).click();
    	try {Thread.sleep(3000);} catch (Exception e) {System.out.println("interrupted");}
    	driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='Login']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
        driver.findElement(By.xpath("//*[@id='menu_help']")).click();
        try {Thread.sleep(3000);} catch (Exception e) {System.out.println("interrupted");}
        driver.navigate().back();
        
        //switch off Wi-Fi
        driver.closeApp();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.findElement(By.xpath("//*[@text='Apps']")).click();
        driver.findElement(By.xpath("//*[@class='android.view.View' and ./parent::*[@id='tabcontent']]")).click();
        driver.findElement(By.xpath("//*[@id='search_src_text']")).sendKeys("settings");
        driver.findElement(By.xpath("//*[@text='Settings']")).click();
        driver.findElement(By.xpath("//*[@text='Wi-Fi, Bluetooth, Data usage, Flight mode']")).click();
        driver.findElement(By.xpath("//*[@id='switch_widget' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Wi-Fi']]]]]")).click();
        
        //Open app again and view help with wifi switched off
        driver.launchApp();
        driver.findElement(By.xpath("//*[@id='menu_help_login']")).click();
        
        
        
        
                
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
