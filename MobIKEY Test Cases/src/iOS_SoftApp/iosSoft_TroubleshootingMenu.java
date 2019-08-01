package iOS_SoftApp;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.*;
import io.appium.java_client.*;
import io.appium.java_client.ios.*;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.TouchAction;
import java.time.Duration;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.logging.Level;

@SuppressWarnings("unused")

public class iosSoft_TroubleshootingMenu {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected IOSDriver<IOSElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "4b82f1af4f4e6e6ba23879ceddb68bdc5e63ec3d");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.r1MobiKEY");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
    	
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
        
        
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        
        driver.findElement(By.xpath("//*[contains(@text, 'Unique ID:')]")).click();
        try {Thread.sleep(1000);} catch(Exception e) {}
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        
        driver.findElement(By.xpath("//*[contains(@text, 'MobiNET ID:')]")).click();
        try {Thread.sleep(1000);} catch(Exception e) {}
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        
        driver.findElement(By.xpath("//*[contains(@text, 'Version:')]")).click();
        try {Thread.sleep(1000);} catch(Exception e) {}
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        
        driver.findElement(By.xpath("//*[contains(@text, 'Remote ID:')]")).click();
        try {Thread.sleep(1000);} catch(Exception e) {}
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        
        driver.findElement(By.xpath("//*[contains(@text, 'Domain:')]")).click();
        try {Thread.sleep(1000);} catch(Exception e) {}
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        
        driver.findElement(By.xpath("//*[contains(@text, 'IP Address:')]")).click();
        try {Thread.sleep(1000);} catch(Exception e) {}
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        
        driver.findElement(By.xpath("//*[contains(@text, 'Configuration:')]")).click();
        try {Thread.sleep(1000);} catch(Exception e) {}
        
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
  
    }

    @After
    public void tearDown() {
    }
}