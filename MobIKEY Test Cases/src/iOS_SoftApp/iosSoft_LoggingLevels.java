package iOS_SoftApp;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Android_SoftApp.JUnitTestReporter;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class iosSoft_LoggingLevels extends JUnitTestReporter {
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
        dc.setCapability("deviceName", "iOS");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.r1MobiKEY");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
    	/*ERROR---------------------------------------------------------------------------ERROR-----------------------------------------------------------------------------ERROR*/
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
        driver.findElement(By.xpath("//*[@text='Error']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Online']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	try {
    	    Thread.sleep(25000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
   	}
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
        
        System.out.println("Please check the last log, it should be an Error log.");
        
        try {
        	Thread.sleep(20000);
        } catch(InterruptedException e) {
        	System.out.println("Got interrupted");
        }
        driver.closeApp();
        
    	/*INFO---------------------------------------------------------------------------INFO-----------------------------------------------------------------------------INFO*/
        driver.launchApp();
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
        driver.findElement(By.xpath("//*[@text='Info']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Online']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	try {
    	    Thread.sleep(25000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
   	}
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
        System.out.println("Please check the last log, it should be an Info log.");
        try {
        	Thread.sleep(15000);
        } catch(InterruptedException e) {
        	System.out.println("Got interrupted");
        }
        driver.closeApp();
        
    	/*DEBUG---------------------------------------------------------------------------DEBUG-----------------------------------------------------------------------------DEBUG*/
        driver.launchApp();
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
        driver.findElement(By.xpath("//*[@text='Debug']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Online']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	try {
    	    Thread.sleep(25000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
   	}
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
        
        try {
        	Thread.sleep(15000);
        } catch(InterruptedException e) {
        	System.out.println("Got interrupted");
        }
        driver.closeApp();
     
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}