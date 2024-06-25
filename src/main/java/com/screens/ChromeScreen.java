package com.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.WebUtil;

import io.appium.java_client.windows.WindowsDriver;

public class ChromeScreen extends WebUtil {

	private final By searchBar = By.name("Address and search bar");

	public ChromeScreen(WindowsDriver<WebElement> driver) {
		super(driver);
	}

	public void enterURL(String url) {
		pauseInSeconds(5);
		enter(searchBar, url);
		pauseInSeconds(2);
	}

}
