package iOS_SoftApp;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class iosSoft_OrientationTest extends JUnitTestReporter {
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
    public void testUntitled() {
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
     	driver.rotate(ScreenOrientation.PORTRAIT);
     	driver.rotate(ScreenOrientation.LANDSCAPE);
     	
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Online']]")));
    	
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
     	driver.rotate(ScreenOrientation.PORTRAIT);
     	driver.rotate(ScreenOrientation.LANDSCAPE);
     	
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	try {
    	    Thread.sleep(25000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
    	driver.rotate(ScreenOrientation.PORTRAIT);
       	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
    	
    	
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        
        driver.rotate(ScreenOrientation.PORTRAIT);
       	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
    	 
        driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
        
       	driver.rotate(ScreenOrientation.PORTRAIT);
       	driver.rotate(ScreenOrientation.LANDSCAPE);
    	driver.rotate(ScreenOrientation.PORTRAIT);
    	driver.rotate(ScreenOrientation.LANDSCAPE);
        
        try {
        	Thread.sleep(3000);
        } catch(InterruptedException e) {
        	System.out.println("Got interrupted");
        }
    }
        
    @After
    public void tearDown() {
    	driver.quit();
    	
    }
}