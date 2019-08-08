package Android_SoftApp;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import iOS_SoftApp.JUnitTestReporter;

import org.openqa.selenium.By;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

	public class iosAndroid_SetProxyGetLog extends JUnitTestReporter {
		public static void main(String[] args) {
	        Result result = JUnitCore.runClasses(Login10Times.class);
	        for (Failure failure : result.getFailures()) {
	            System.out.println(failure.toString());
	        }
		}
		
	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "SoftApp.Android.StartSess.EndSess";
	protected static AndroidDriver<AndroidElement> driver = null;

	DesiredCapabilities dc = new DesiredCapabilities();
	   
	@Before
	public void setUp() throws MalformedURLException {
	        dc.setCapability("reportDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability("deviceName", "Android");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.route1.mobi.android");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.LaunchingActivity");
	        dc.setCapability(MobileCapabilityType.NO_RESET, true);
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);
	    }

	@Test
	public void testSoftApp_Android_StartSess_EndSess() {
		//Login
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Route123");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();    
	    //Open Menu
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_settings']")));
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_settings']")));
	        driver.findElement(By.xpath("//*[@id='menu_settings']")).click();
	    //Add new proxy profile
	        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Proxy']]")).click();
	        
	        
	        try 
	        {
	        if (driver.findElement(By.xpath("//*[@text='Automated Proxy (192.168.205.230)']")).isDisplayed()) 
	        {
	        	driver.findElement(By.xpath("//*[@text='Edit']")).click();
	            driver.findElement(By.xpath("//*[@text='Delete']")).click();
	            driver.findElement(By.xpath("//*[@text='Done']")).click();
	        }
	        }
	        catch (Exception e)
	        {
	        	System.out.println("Good to go!");
	        }
	        
	        driver.findElement(By.xpath("//*[@text='Add']")).click();
	        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_profile_name_text']")).click();
	        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_profile_name_text']")).sendKeys("Automated Proxy");
	        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_address_text']")).click();
	        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_address_text']")).sendKeys("192.168.205.230");
	        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_port_text']")).click();
	        driver.findElement(By.xpath("//*[@id='settings_proxy_settings_port_text']")).sendKeys("8080");
	        driver.findElement(By.xpath("//*[@text='Save']")).click();
	        new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='OK']")));
	        driver.findElement(By.xpath("//*[@text='OK']")).click();
	        driver.findElement(By.xpath("//*[@text='Close']")).click();
	        driver.navigate().back();
	        driver.findElement(By.xpath("//*[@text='Refresh List']")).click();
	       try {Thread.sleep(5000);} catch(Exception e) {}
	       driver.findElement(By.xpath("//*[@id='menu_settings']")).click();
	       driver.findElement(By.xpath("//*[@text='Troubleshooting']")).click();
	       driver.findElement(By.xpath("//*[contains(@text, 'log.htproxy.log')]")).click();
	       driver.findElement(By.xpath("//*[@text='View']")).click();

	    }

    @After
	public void tearDown() {

	    }
}



        