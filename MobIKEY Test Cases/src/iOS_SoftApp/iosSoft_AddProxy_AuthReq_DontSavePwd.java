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
        driver.findElement(By.xpath("//*[@placeholder='Required']")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	
    	try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
         driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
         driver.findElement(By.xpath("//*[@text='Proxy']")).click();
         driver.findElement(By.xpath("//*[@text='Add']")).click();
         driver.findElement(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[1]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[1]")).sendKeys("AutomatedProxy");
         new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[1]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[3]")));
         driver.findElement(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[3]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[3]")).sendKeys("192.168.205.230");
         new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[1]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[4]")));
         driver.findElement(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[4]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[4]")).click();
         driver.findElement(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[4]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[4]")).sendKeys("8080");
         driver.findElement(By.xpath("//*[@text='Save']")).click();
         driver.findElement(By.xpath("//*[@text='OK']")).click();
         driver.findElement(By.xpath("//*[@text='Close']")).click();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}