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
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;



public class AndroidSoft_UItests extends JUnitTestReporter {
	
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
//    	//Login
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='Login']")).click();
        try {Thread.sleep(3000);} catch(Exception e) {}
        
        //Open Menu
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_settings']")));
        driver.findElement(By.xpath("//*[@id='menu_settings']")).click();
        
        
        //Test Session settings
        driver.findElement(By.xpath("//*[@text='8-bit']")).click();
        driver.findElement(By.xpath("//*[@text='16-bit']")).click();
        driver.findElement(By.xpath("//*[@text='24-bit']")).click();
        
        driver.findElement(By.xpath("//*[@text='AES-128']")).click();
        driver.findElement(By.xpath("//*[@text='AES-256']")).click();
        
        driver.findElement(By.xpath("//*[@text='V1']")).click();
        driver.findElement(By.xpath("//*[@text='V2']")).click();
        
        
        //Test Troubleshooting menu
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Troubleshooting']]")).click();
        driver.findElement(By.xpath("//*[contains(@text, 'Unique ID')]")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[contains(@text, 'MobiNET ID')]")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[contains(@text, 'Version')]")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[contains(@text, 'Remote ID')]")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[contains(@text, 'Domain')]")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[contains(@text, 'IP Address')]")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[contains(@text, 'Configuration')]")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        //logging
        driver.findElement(By.xpath("//*[@text='Error']")).click();
        driver.findElement(By.xpath("//*[@text='Info']")).click();
        driver.findElement(By.xpath("//*[@text='None']")).click();
        driver.findElement(By.xpath("//*[@text='Debug']")).click();
        
        
        //Test Proxy Settings
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Proxy']]")).click();
        try {
        if (driver.findElement(By.xpath("//*[@text='Automated Proxy (192.168.205.230)']")).isDisplayed()) 
        {
        	driver.findElement(By.xpath("//*[@text='Edit']")).click();
            driver.findElement(By.xpath("//*[@text='Delete']")).click();
            driver.findElement(By.xpath("//*[@text='Done']")).click();
        }
        }
        catch (Exception e){
        	System.out.println("Good to go!");
        }
        driver.findElement(By.xpath("//*[@text='Add']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_profile_name_text']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_profile_name_text']")).sendKeys("Automated Proxy");
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_address_text']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_address_text']")).sendKeys("192.168.205.230");
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_port_text']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_port_text']")).sendKeys("8080");
        driver.findElement(By.xpath("//*[@text='Save']")).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='OK']")));
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='Close']")).click();
        driver.navigate().back();
        
        //Start a session with proxy and Debug logging enabled
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Online']")));
        driver.findElement(By.xpath("//*[@text='Online']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='close_button']")));
        driver.findElement(By.xpath("//*[@id='close_button']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Yes']")));
        driver.findElement(By.xpath("//*[@text='Yes']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
        
        //Check the logs
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_settings']")));
        driver.findElement(By.xpath("//*[@id='menu_settings']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLqayout' and ./*[@text='Troubleshooting']]")).click();
        Map<String, Object> args = new HashMap<>();
        args.put("direction", "down");
        driver.executeScript("mobile: scroll", args);
        driver.findElement(By.xpath("//*[contains(@text, 'MobiLog')]")).click();
        driver.findElement(By.xpath("//*[@text='View']")).click();
        try {Thread.sleep(5000);} catch(Exception e) {}
        
        //navigate back to host list
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        
    }

    @After
    public void tearDown() {
    }
}