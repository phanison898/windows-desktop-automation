package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.windows.WindowsDriver;

public class WebUtil {

	private WindowsDriver<WebElement> driver;

	public WebUtil(WindowsDriver<WebElement> driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {

		}
		return element;
	}

	public WebElement getElement(String name) {
		WebElement element = null;
		try {
			element = driver.findElementByName(name);
		} catch (Exception e) {

		}
		return element;
	}

	public void click(By locator) {
		getElement(locator).click();
	}

	public WebElement findElementByAccessibilityId(String id) {
		return driver.findElementByAccessibilityId(id);
	}

	public void click(String locator) {
		getElement(locator).click();
	}

	public void enter(By locator, String text) {
		WebElement element = getElement(locator);
		element.clear();
		element.sendKeys(text);
	}

	public String getText(By locator) {
		return getElement(locator).getText();
	}

}
