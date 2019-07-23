package android_Purebred;

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

	public class AndroidPB_Login10Times extends JUnitTestReporter {
		public static void main(String[] args) {
	        Result result = JUnitCore.runClasses(AndroidPB_Login10Times.class);
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
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.route1.mobi.android.purebred");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.route1.mobi.android.activities.LaunchingActivity");
	        dc.setCapability(MobileCapabilityType.NO_RESET, true);
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);
	    }

	@Test
	public void testSoftApp_Android_StartSess_EndSess() {
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	        
	        
	        ((AndroidDriver<?>) driver).launchApp();
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	        
	        
	        ((AndroidDriver<?>) driver).launchApp();
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	        
	        
	        ((AndroidDriver<?>) driver).launchApp();
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	        
	        
	        ((AndroidDriver<?>) driver).launchApp();
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	        
	        
	        ((AndroidDriver<?>) driver).launchApp();
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	        
	        
	        ((AndroidDriver<?>) driver).launchApp();
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	        
	        
	        ((AndroidDriver<?>) driver).launchApp();
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	        
	        
	        ((AndroidDriver<?>) driver).launchApp();
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	        
	        
	        ((AndroidDriver<?>) driver).launchApp();
	        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//*[@text='Login']")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Refresh List']")));
	        ((AndroidDriver<?>) driver).closeApp();
	    }

    @After
	public void tearDown() {
	        driver.quit();
	    }
}
