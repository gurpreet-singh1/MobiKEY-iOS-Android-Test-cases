package iOS_SoftApp;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

@SuppressWarnings({"rawtypes", "unused"})


public class iosSoft_AddProxy_AuthReq_DontSavePwd extends JUnitTestReporter {
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
       //dc.setCapability(MobileCapabilityType.UDID, "9d3a55d43a66a42977cfec941f6d729524330902");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.r1MobiKEY");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void Test() {
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Proxy']")).click();
       
        
        try 
        {
        if (driver.findElement(By.xpath("//*[@text='Automated Proxy (192.168.205.230)']")).isDisplayed()) 
        {
        	driver.findElement(By.xpath("//*[@text='Edit']")).click();
        	driver.findElement(By.xpath("//*[@text='Delete Automated Proxy (192.168.205.230)']")).click();
            driver.findElement(By.xpath("//*[@text='Delete']")).click();
            driver.findElement(By.xpath("//*[@text='Done']")).click();
        }
        }
        catch (Exception e)
        {
        	System.out.println("Good to go!");
        }
        
        driver.findElement(By.xpath("//*[@text='Add']")).click();

        
        driver.findElement(By.xpath("(//*[@class='UIATextField' and (./preceding-sibling::* | ./following-sibling::*)[@text='Address']])[1]")).click();
        driver.getKeyboard().sendKeys("Automated Proxy");
        driver.findElement(By.xpath("(//*[@class='UIATextField' and (./preceding-sibling::* | ./following-sibling::*)[@text='Address']])[3]")).click();
        driver.getKeyboard().sendKeys("192.168.205.230");
        driver.findElement(By.xpath("(//*[@class='UIATextField' and (./preceding-sibling::* | ./following-sibling::*)[@text='Address']])[4]")).click();
        driver.getKeyboard().sendKeys("8080");
        
        driver.findElement(By.xpath("(//*[@class='UIATextField' and (./preceding-sibling::* | ./following-sibling::*)[@text='User Name']])[5]")).click();
        driver.getKeyboard().sendKeys("test");
        driver.findElement(By.xpath("(//*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password']])")).click();
        driver.getKeyboard().sendKeys("test");
        driver.findElement(By.xpath("(//*[@class='UIATextField' and (./preceding-sibling::* | ./following-sibling::*)[@text='Domain']])[6]")).click();
        driver.getKeyboard().sendKeys("route1");
        
       // driver.findElement(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[1]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@text='0'])[2]")).click();
   
        
//		  TouchAction touchAction = new TouchAction(driver);
//        touchAction.tap(PointOption.point(748, 274)).perform();
//        driver.getKeyboard().sendKeys("Automated Proxy");
//        driver.findElement(By.xpath("//*[@text='Hide keyboard']")).click();
//        
//        TouchAction touchAction1 = new TouchAction(driver);
//        touchAction1.tap(PointOption.point(746, 492)).perform();
//        driver.getKeyboard().sendKeys("192.168.205.230");
//        driver.findElement(By.xpath("//*[@text='Hide keyboard']")).click();
//        
//        TouchAction touchAction2 = new TouchAction(driver);
//        touchAction2.tap(PointOption.point(746, 562)).perform();
//        driver.getKeyboard().sendKeys("8080");
//        driver.findElement(By.xpath("//*[@text='Hide keyboard']")).click();

        
        driver.findElement(By.xpath("//*[@text='Save']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='Close']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
        try {
        	Thread.sleep(5000);
        	} catch(Exception e){
        		
        	}

    }

    @After
    public void tearDown() {

    }
}