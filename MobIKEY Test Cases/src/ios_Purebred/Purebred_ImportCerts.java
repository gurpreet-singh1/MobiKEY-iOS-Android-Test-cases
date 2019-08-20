package ios_Purebred;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

@SuppressWarnings("unused")
public class Purebred_ImportCerts {
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
//        dc.setCapability(MobileCapabilityType.UDID, "4b82f1af4f4e6e6ba23879ceddb68bdc5e63ec3d");
        dc.setCapability("deviceName", "iOS");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.MobiKEYPureBred");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
    	
        //Reset configuration
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        driver.findElement(By.xpath("//*[@text='Reset Configuration']")).click();
        driver.findElement(By.xpath("//*[@text='Continue']")).click();
        
        //Import credentials
        driver.findElement(By.xpath("//*[@text='MobiNET (Default)']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        driver.findElement(By.xpath("//*[@text='Import Credential']")).click();
        driver.findElement(By.xpath("//*[@text='Locations']")).click();
        driver.findElement(By.xpath("//*[@text='Purebred Key Chain']")).click();
        driver.findElement(By.xpath("(//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[./parent::*[@class='UIAView']]]]]/*/*[@text='PBUSER4.ROUTE1@example.mil'])[1]")).click();
        driver.findElement(By.xpath("//*[@text='Import key']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Password']")));
        driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("password");
        driver.findElement(By.xpath("//*[@placeholder='Retype Password']")).sendKeys("password");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='OK']")));
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='Yes']")).click();
        driver.findElement(By.xpath("//*[@text='Locations']")).click();
        driver.findElement(By.xpath("//*[@text='Purebred Key Chain']")).click();
        driver.findElement(By.xpath("(//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[./parent::*[@class='UIAView']]]]]/*/*[@text='PBUSER4.ROUTE1@example.mil'])[2]")).click();
        driver.findElement(By.xpath("//*[@text='Import key']")).click();
        driver.findElement(By.xpath("//*[@text='No']")).click();
        driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(15000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    }	

    @After
    public void tearDown() {
        driver.quit();
    }
}