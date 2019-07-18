package iOS_A2T_PIV;
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

public class Testingtests {
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
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.MobiKEYiR301UB");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
        driver.findElement(By.xpath("//*[@text='MobiNET (Default)']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((((//*[@text='MobiKEY A2T']/*[@class='UIAWindow'])[1]/*[@class='UIAView'])[2]/*[@class='UIAView'])[1]/*[@class='UIAImage'])[4]")));
        driver.findElement(By.xpath("((((//*[@text='MobiKEY A2T']/*[@class='UIAWindow'])[1]/*[@class='UIAView'])[2]/*[@class='UIAView'])[1]/*[@class='UIAImage'])[4]")).click();
        driver.findElement(By.xpath("//*[@placeholder='Required']")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Online' and (./preceding-sibling::* | ./following-sibling::*)[@text='DELL-UEFI']]")));
        driver.findElement(By.xpath("//*[@text='Online' and (./preceding-sibling::* | ./following-sibling::*)[@text='DELL-UEFI']]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='OK']")));
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='Online' and (./preceding-sibling::* | ./following-sibling::*)[@text='QAMOBHOSTCLONE']]")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='OK']")));
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")));
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        new WebDriverWait(driver, 120).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and @height>0 and ./*[@text='MobiKEY'] and ./*[@class='UIAButton']]")));
        driver.findElement(By.xpath("//*[@class='UIAView' and @height>0 and ./*[@text='MobiKEY'] and ./*[@class='UIAButton']]")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}