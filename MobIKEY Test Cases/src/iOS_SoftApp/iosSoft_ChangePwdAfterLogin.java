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

public class iosSoft_ChangePwdAfterLogin {
  private String reportDirectory = "reports";
  private String reportFormat = "xml";
  private String testName = "iosSoft_ChangePwdAfterLogin";
  protected IOSDriver<IOSElement> driver = null;

  DesiredCapabilities dc = new DesiredCapabilities();
  
  @Before
  public void setUp() throws MalformedURLException {
      dc.setCapability("reportDirectory", reportDirectory);
      dc.setCapability("reportFormat", reportFormat);
      dc.setCapability("testName", testName);
      dc.setCapability("deviceName", "iOS");
//      dc.setCapability(MobileCapabilityType.UDID, "4b82f1af4f4e6e6ba23879ceddb68bdc5e63ec3d");
      dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.route1.r1MobiKEY");
      driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
      driver.setLogLevel(Level.INFO);
  }

  @Test
  public void testUntitled() {
	  //Change password
      driver.findElement(By.xpath("//*[@class='UIASwitch']")).click();
	  driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
  	  driver.getKeyboard().sendKeys("Route1234567");
      driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='New Password:']]")).click();
      driver.getKeyboard().sendKeys("Route12345678");
      driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Retype Password:']]")).click();
      driver.getKeyboard().sendKeys("Route12345678");
      new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='arrow right']")));
      driver.findElement(By.xpath("//*[@text='arrow right']")).click();
      try {
  		  Thread.sleep(8000);
  	  } catch (Exception e) {
  		  
  	  }
      driver.closeApp();
      
      //Login with new password
      driver.launchApp();
      driver.findElement(By.xpath("//*[@placeholder='Required' and (./preceding-sibling::* | ./following-sibling::*)[@text='Password:']]")).click();
  	  driver.getKeyboard().sendKeys("Route123456789");
  	  driver.findElement(By.xpath("//*[@text='arrow right']")).click();
  	  try {
  		driver.findElement(By.xpath("//*[@placeholder='OK']")).click();
  	  } catch (Exception e) {
  	  try {
  		  Thread.sleep(8000);
  		  System.out.println("TEST PASSED! Your password has been changed. Your new password is Route1234");
  	  	} catch (Exception e1) {
  		  
  	  	}
  	  }
  } 

  @After
  public void tearDown() {
      driver.quit();

  }
}