package iOS_SoftApp;
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

public class TestingTests {
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
        dc.setCapability(MobileCapabilityType.UDID, "9d3a55d43a66a42977cfec941f6d729524330902");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.r1MobiKEY");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
        driver.getKeyboard().sendKeys("ute123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Proxy']")).click();
        driver.findElement(By.xpath("//*[@text='Empty list']")).click();
        driver.findElement(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[1]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[1]")).sendKeys("AutomatedProxy");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[1]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[3]")));
        driver.findElement(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[1]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[3]")).sendKeys("192.168.205.230");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[1]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[4]")));
        driver.findElement(By.xpath("(((//*[@text='MobiKEY']/*[@class='UIAWindow'])[1]/*/*/*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView'] and ./parent::*[@class='UIAView']]])[3]/*[@class='UIATextField'])[4]")).sendKeys("8080");
        driver.findElement(By.xpath("//*[@text='Save']")).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='OK']")));
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='Close']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        driver.findElement(By.xpath("//*[@text='8-bit']")).click();
        driver.findElement(By.xpath("//*[@text='24-bit']")).click();
        driver.findElement(By.xpath("//*[@text='16-bit']")).click();
        driver.findElement(By.xpath("//*[@text='V1']")).click();
        driver.findElement(By.xpath("//*[@text='V2']")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        driver.findElement(By.xpath("//*[@text='Unique ID: 2B1832A372F241D281E5F3CC97603F30']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[@text='MobiNET ID: BBFA046']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[@text='Proxy']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
        driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
        
        
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='DELL-UEFI']]")));
        driver.findElement(By.xpath("//*[@class='UIAView' and ./*[@text='DELL-UEFI']]")).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Cancel']")));
        driver.findElement(By.xpath("//*[@text='Cancel']")).click();
        driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
        new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
        driver.findElement(By.xpath("//*[@text='DELL-UEFI']")).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
        
        
        
        
        
        driver.getKeyboard().sendKeys("oute122");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).sendKeys("Route122");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='arrow right']")));
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@placeholder='Required']")).sendKeys("Route122");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@placeholder='Required']")).sendKeys("Route122");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@placeholder='Required']")).sendKeys("Route1234");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        driver.findElement(By.xpath("//*[@class='UIATable']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@placeholder='Required']")).sendKeys("Route12345");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@placeholder='Required']")).sendKeys("Route123456");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='arrow right']")));
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Starting MobiKEY...']]")));
        driver.findElement(By.xpath("//*[@class='UIAView' and ./*[@text='Starting MobiKEY...']]")).click();
        driver.findElement(By.xpath("//*[@text='Your MobiKEY application is locked. In order to unlock it you will need to re-register with MobiNET.']")).click();
        driver.executeScript("seetest:client.deviceAction(\"Home\")");
//        new TouchAction(driver).press(1453, 971).waitAction(Duration.ofMillis(200)).moveTo(-4, 948).release().perform();
        driver.findElement(By.xpath("//*[@text='MobiKEY' and (./preceding-sibling::* | ./following-sibling::*)[@text='Tips']]")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        driver.findElement(By.xpath("//*[@text='Reset Configuration']")).click();
        driver.findElement(By.xpath("//*[@text='Cancel']")).click();
        driver.executeScript("seetest:client.deviceAction(\"Home\")");
        driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Username:']]")).sendKeys("qqqqqqqq");


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}