package iOS_SoftApp;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class iosSoft_SessionWithOfflineHost extends JUnitTestReporter {
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
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Offline']]")));
    	driver.findElement(By.xpath("//*[@text='Offline']")).click();
    	} catch (Exception e) {
    		System.out.println("There doesn't seem to be an offline host. Please stop the service on your host and restart the test.");
    	}
    	new WebDriverWait(driver, 2).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Offline']]")));

    }
    

    @After
    public void tearDown() {
    	driver.quit();
    	
    }
}