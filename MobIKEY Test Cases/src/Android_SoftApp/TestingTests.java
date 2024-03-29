package Android_SoftApp;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
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
        driver.findElement(By.xpath("//*[@id='menu_help_login']")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.executeScript("seetest:client.deviceAction(\"Enter\")");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='WINDOWS7X64']")));
        driver.findElement(By.xpath("//*[@text='WINDOWS7X64']")).click();
        driver.findElement(By.xpath("//*[@id='host_list']")).click();
        driver.findElement(By.xpath("//*[@id='host_list']")).click();
        driver.findElement(By.xpath("//*[@id='close_button']")).click();
        driver.findElement(By.xpath("//*[@text='Yes']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_help']")));
        driver.findElement(By.xpath("//*[@id='menu_help']")).click();
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.findElement(By.xpath("//*[@text='Apps']")).click();
    //    driver.swipe(1335, 1623, 1335, 1515, 460);
      //  driver.swipe(1235, 505, 1235, 397, 2394);
        driver.findElement(By.xpath("//*[@id='wallpaper_blur']")).click();
        //driver.swipe(1353, 1669, 1376, 1530, 463);
        driver.findElement(By.xpath("//*[@class='android.view.View' and ./parent::*[@id='tabcontent']]")).click();
        driver.findElement(By.xpath("//*[@id='search_src_text']")).sendKeys("settings");
        driver.findElement(By.xpath("//*[@text='Settings']")).click();
        driver.findElement(By.xpath("//*[@text='Wi-Fi, Bluetooth, Data usage, Flight mode']")).click();
        driver.findElement(By.xpath("//*[@id='switch_widget' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Wi-Fi']]]]]")).click();
        driver.findElement(By.xpath("//*[@id='switch_widget' and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='Wi-Fi']]]]]")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}