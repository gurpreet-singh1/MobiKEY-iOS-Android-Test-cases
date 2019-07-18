package ios_Purebred;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import iOS_A2T_CAC.JUnitTestReporter;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;


public class iosPurebred_10Logins extends JUnitTestReporter {
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
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.MobiKEYPureBred");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }


    @Test
    public void testUntitled() {
    	//1
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//2
    	driver.launchApp();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//3
    	driver.launchApp();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//4
    	driver.launchApp();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//5
    	driver.launchApp();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//6
    	driver.launchApp();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	
    	//7
    	driver.launchApp();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//8
    	driver.launchApp();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//9
    	driver.launchApp();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	driver.closeApp();
    	
    	//10
    	driver.launchApp();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
    	driver.getKeyboard().sendKeys("password");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	try {
    	    Thread.sleep(10000);
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