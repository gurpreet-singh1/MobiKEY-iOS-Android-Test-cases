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

public class SoftApp_iOS_Reg extends JUnitTestReporter {
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
    public void test() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Reset Configuration']")));
        driver.findElement(By.xpath("//*[@text='Reset Configuration']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Continue']")));
        driver.findElement(By.xpath("//*[@text='Continue']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Username:']]")));
        driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Username:']]")).sendKeys("qqqqqqqq");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
        driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).sendKeys("qqqqqqqq");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='arrow right']")));
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='arrow right']")));
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='MobiNET password:']]")));
        driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='MobiNET password:']]")).sendKeys("Route123");
        driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Retype password:']]")).sendKeys("Route123");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='arrow right']")));
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
//        try {
//    	    Thread.sleep(10000);
//    	} catch(InterruptedException e) {
//    	    System.out.println("got interrupted!");
//    	}
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='You are currently not associated with any hosts.']")));
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("Registration successful!");
    }
}