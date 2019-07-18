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

public class iosSoft_RunAppInBackground extends JUnitTestReporter {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    @SuppressWarnings("unused")
	private String testName = "Untitled";
    protected IOSDriver<IOSElement> driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();
    
    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", "RunAppInBackground");
        dc.setCapability("deviceName", "iOS");
        dc.setCapability("noReset", true);
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.r1MobiKEY");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }
	@Test
    public void runAppInBackground() {
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (Exception e) {
    		System.out.println("Interrupted");
    	}
    	driver.executeScript("seetest:client.deviceAction(\"Home\")");
    	try {
    		Thread.sleep(1000);
    	} catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    	driver.launchApp();
//    	driver.findElement(By.xpath("//*[@text='MobiKEY']")).click();
    }
    @After
    public void tearDown() {
    	
    }
}