package Android_SoftApp;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
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

	public class AndroidSoft_TroubleshootingMenu extends JUnitTestReporter {
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
	        dc.setCapability("re1portDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability("deviceID", "192.168.2.12:5555");
	        dc.setCapability("deviceName", "Android");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.route1.mobi.android");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.LaunchingActivity");
	        dc.setCapability(MobileCapabilityType.NO_RESET, true);
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);
	    }

	@Test
	public void testSoftApp_Android_StartSess_EndSess() {
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Route123");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();        
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_settings']")));
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu_settings']")));
	        driver.findElement(By.xpath("//*[@id='menu_settings']")).click();
	        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Troubleshooting']]")).click();
	        driver.findElement(By.xpath("//*[@+id/textUniqueId]")).click();
	        driver.findElement(By.xpath("//*[@text='Done']")).click();
	        driver.findElement(By.xpath("//*[@text='MobiNET ID:']")).click();
	        driver.findElement(By.xpath("//*[@text='Done']")).click();
	        driver.findElement(By.xpath("//*[@text='Version:']")).click();
	        driver.findElement(By.xpath("//*[@text='Done']")).click();
	        driver.findElement(By.xpath("//*[@text='Remote ID:']")).click();
	        driver.findElement(By.xpath("//*[@text='Done']")).click();
	        driver.findElement(By.xpath("//*[@text='Domain:']")).click();
	        driver.findElement(By.xpath("//*[@text='Done']")).click();
	        driver.findElement(By.xpath("//*[@text='IP Address:']")).click();
	        driver.findElement(By.xpath("//*[@text='Done']")).click();
	        driver.findElement(By.xpath("//*[@text='Configuration:']")).click();
	        driver.findElement(By.xpath("//*[@text='Done']")).click();
	        driver.navigate().back();
	        driver.navigate().back();
	    }

    @After
	public void tearDown() {
	        driver.quit();
	    }
}



        
        
    