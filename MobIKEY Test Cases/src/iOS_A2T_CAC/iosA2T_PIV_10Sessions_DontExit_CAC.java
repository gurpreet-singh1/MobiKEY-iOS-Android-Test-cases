package iOS_A2T_CAC;
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


public class iosA2T_PIV_10Sessions_DontExit_CAC extends JUnitTestReporter {
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
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='PIN:']]")));
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='PIN:']]")).click();
    	driver.getKeyboard().sendKeys("77777777");
    	driver.findElement(By.xpath("//*[@text='arrow right']")).click();
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Online']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	
    	//2
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}

    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	
    	
    	//3
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}

    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	
    	//4
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}

    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	
    	//5
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}

    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	
    	//6
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}

    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	
    	//7
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}

    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	
    	//8
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}

    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	
    	//9
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}

    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	
    	//10
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	driver.findElement(By.xpath("//*[@text='Online']")).click();
    	
    	try {
    	    Thread.sleep(30000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}

    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")));
    	driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[1]")).click();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		
    	}
    	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Add Host']]")));
    	
        
        
    }
    	
    @After
    public void tearDown() {
        driver.quit();
    }
}