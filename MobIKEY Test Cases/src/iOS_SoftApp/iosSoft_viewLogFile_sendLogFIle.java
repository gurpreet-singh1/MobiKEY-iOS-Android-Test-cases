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
import java.util.Map;
import java.util.logging.Level;

@SuppressWarnings("rawtypes")

public class iosSoft_viewLogFile_sendLogFIle {
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

    @SuppressWarnings("unchecked")
	@Test
    public void testUntitled() {
    	
    	//Login
    	
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
        
    	//Enable Debug Logging

        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        driver.findElement(By.xpath("//*[@text='Debug']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
       
        
    	
    	//Refresh Host list to generate a log file.
        
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Refresh List']]")));
        driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
        try {
        	Thread.sleep(7000);
        } catch(InterruptedException e) {
     	    System.out.println("got interrupted!");
        }
    	
    	
        //send a Log File
       driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
       driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
       //scroll down
       Map<String, Object> args = new HashMap<>();
       args.put("direction", "down");
       driver.executeScript("mobile: scroll", args);
       driver.findElement(By.xpath("//*[contains(@text, 'Today at')]")).click();
       
       driver.findElement(By.xpath("//*[@text='Send']")).click();
       driver.findElement(By.xpath("//*[@accessibilityLabel='toField']")).click();
       driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
       driver.executeScript("seetest:client.deviceAction(\"BKSP\")");
       driver.getKeyboard().sendKeys("gurpreet.singh@groupmobile.com");
       driver.getKeyboard().sendKeys("\n");
       driver.findElement(By.xpath("//*[@text='Send']")).click();
       
       
       //View Log File
       driver.findElement(By.xpath("//*[contains(@text, 'Today at')]")).click();
       driver.findElement(By.xpath("//*[@text='View']")).click();
       driver.findElement(By.xpath("//*[@text='MobiKEY']")).click();
 
    }

    @After
    public void tearDown() {
    }
}