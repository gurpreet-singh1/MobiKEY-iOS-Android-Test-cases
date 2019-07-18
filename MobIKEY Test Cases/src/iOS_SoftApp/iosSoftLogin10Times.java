package iOS_SoftApp;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
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


public class iosSoftLogin10Times extends JUnitTestReporter {
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
    	//1
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//2
    	driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//3
    	driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//4
    	driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//5
    	driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//6
    	driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//7
    	driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//8
    	driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//9
    	driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//10
    	driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("Route123");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(7000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}