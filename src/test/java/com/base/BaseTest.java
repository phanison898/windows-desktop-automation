package com.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.windows.WindowsDriver;

public class BaseTest {

	public static WindowsDriver<WebElement> driver;

	@BeforeSuite
	public void beforeSuite() {
	}

	@BeforeMethod
	public void setup() {
		MutableCapabilities cap = new MutableCapabilities();
		cap.setCapability("platformName", "WINDOWS");
		cap.setCapability("deviceName", "WINDOWS");
		cap.setCapability("automationName", "WINDOWS");
		cap.setCapability("driverType", "WINDOWS");
		cap.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
		cap.setCapability("ms:waitForAppLaunch", "5");
		cap.setCapability("ms:experimental-webdriver", false);

		URL url = null;
		try {
			url = new URL("http://127.0.0.1:4723");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver = new WindowsDriver<WebElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tear() {
		driver.quit();
	}

}
