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

public class iosSoft_5LogFiles {
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
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.r1MobiKEY");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
         driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        driver.findElement(By.xpath("//*[@text='Error']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Refresh List']]")));
    	driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
    	  try {
      	    Thread.sleep(7000);
      	} catch(InterruptedException e) {
      	    System.out.println("got interrupted!");
      	}
      	
        driver.closeApp();
     
       /*2nd Log---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
         driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        driver.findElement(By.xpath("//*[@text='Error']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Refresh List']]")));
    	driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
    	  try {
      	    Thread.sleep(7000);
      	} catch(InterruptedException e) {
      	    System.out.println("got interrupted!");
      	}
      	
        driver.closeApp();
        
        /*3rd Log---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
         driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        driver.findElement(By.xpath("//*[@text='Error']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Refresh List']]")));
    	driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
    	  try {
      	    Thread.sleep(7000);
      	} catch(InterruptedException e) {
      	    System.out.println("got interrupted!");
      	}
      	
        driver.closeApp();
        
        /*4th Log---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
         driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        driver.findElement(By.xpath("//*[@text='Error']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Refresh List']]")));
    	driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
    	  try {
      	    Thread.sleep(7000);
      	} catch(InterruptedException e) {
      	    System.out.println("got interrupted!");
      	}
      	
        driver.closeApp();
        
        /*5th Log---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
         driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        driver.findElement(By.xpath("//*[@text='Error']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Refresh List']]")));
    	driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
    	  try {
      	    Thread.sleep(7000);
      	} catch(InterruptedException e) {
      	    System.out.println("got interrupted!");
      	}
        driver.closeApp();
        
        /*6th Log---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        driver.launchApp();
    	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
        driver.getKeyboard().sendKeys("Route123");
        driver.findElement(By.xpath("//*[@text='arrow right']")).click();
        try {
    	    Thread.sleep(5000);
    	} catch(InterruptedException e) {
    	    System.out.println("got interrupted!");
    	}
    	
         driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
        driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
        driver.findElement(By.xpath("//*[@text='Error']")).click();
        driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[3]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAView' and ./*[@text='Refresh List']]")));
    	driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
    	  try {
        	    Thread.sleep(7000);
        	} catch(InterruptedException e) {
        	    System.out.println("got interrupted!");
        	}
          driver.closeApp();
    	
    	/*After------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
          driver.launchApp();
      	driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
          driver.getKeyboard().sendKeys("Route123");
          driver.findElement(By.xpath("//*[@text='arrow right']")).click();
          try {
      	    Thread.sleep(5000);
      	} catch(InterruptedException e) {
      	    System.out.println("got interrupted!");
      	}
      	
           driver.findElement(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@text='Toolbar']]]/*[@class='UIAButton'])[4]")).click();
          driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
    	System.out.println("Please check the logs and confirm that there are only 4 Log files in the list.");
      	
    }
    @After
    public void tearDown() {
    }
}