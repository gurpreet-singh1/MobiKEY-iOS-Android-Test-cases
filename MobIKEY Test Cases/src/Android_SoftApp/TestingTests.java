package Android_SoftApp;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import java.time.Duration;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidKeyCode;
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
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "33002fd9d2b41353");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.route1.mobi.android");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.LaunchingActivity");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='Login']")).click();
        driver.findElement(By.xpath("//*[@id='menu_settings']")).click();
        driver.findElement(By.xpath("//*[@text='8-bit']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_settings']")));
        driver.findElement(By.xpath("//*[@id='menu_settings']")).click();
        driver.findElement(By.xpath("//*[@text='16-bit']")).click();
       // new TouchAction(driver).press(684, 1835).waitAction(Duration.ofMillis(1771)).moveTo(1335, 82).release().perform();
        driver.findElement(By.xpath("//*[@text='24-bit']")).click();
        //new TouchAction(driver).press(822, 1888).waitAction(Duration.ofMillis(1501)).moveTo(1331, 95).release().perform();
        driver.findElement(By.xpath("//*[@text='V1']")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='Login']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_settings']")));
        driver.findElement(By.xpath("//*[@id='menu_settings']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Troubleshooting']]")).click();
        driver.findElement(By.xpath("//*[@text='Unique ID:   47608fb41324ae7e']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[@text='MobiNET ID:   aeef1CE']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[@text='Version:   5.4.51']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[@text='Remote ID:   3BAAE150AEDD59CFB6F0DA7F41B58CDA']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[@text='Domain:   buzavdi.com']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[@text='IP Address:   192.168.33.69']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[@text='Configuration:   MobiNET']")).click();
        driver.findElement(By.xpath("//*[@text='Done']")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Proxy']]")).click();
        driver.findElement(By.xpath("//*[@text='Add']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_profile_name_text']")).sendKeys("TEST");
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_address_text']")).sendKeys("192.168.205.230");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='settings_proxy_settings_port_text']")));
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_port_text']")).sendKeys("8080");
        driver.findElement(By.xpath("//*[@text='Save']")).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='OK']")));
        driver.findElement(By.xpath("//*[@text='OK']")).click();
        driver.findElement(By.xpath("//*[@text='Close']")).click();
        driver.pressKeyCode(AndroidKeyCode.BACK);
     //  By.xpath(//(element_tag)[starts-with(@id,‘apple_’)])
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_profile_name_text']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_address_text']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_port_text']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_address_text']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_port_text']")).sendKeys("8080");
        driver.findElement(By.xpath("//*[@text='HTTP']")).click();
        driver.findElement(By.xpath("//*[@text='HTTP']")).click();
        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_profile_name_text']")).click();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}