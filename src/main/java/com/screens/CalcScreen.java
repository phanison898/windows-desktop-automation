package com.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.WebUtil;

import io.appium.java_client.windows.WindowsDriver;

public class CalcScreen extends WebUtil {

	private By zero = By.name("Zero");
	private By one = By.name("One");
	private By two = By.name("Two");
	private By three = By.name("Three");
	private By four = By.name("Four");
	private By five = By.name("Five");
	private By six = By.name("Six");
	private By seven = By.name("Seven");
	private By eight = By.name("Eight");
	private By nine = By.name("Nine");
	private By plus = By.name("Plus");
	private By minus = By.name("Minus");
	private By multiply = By.name("Multiply by");
	private By divide = By.name("Divide by");
	private By equals = By.name("Equals");
	private String resultLocator = "CalculatorResults";

	public CalcScreen(WindowsDriver<WebElement> driver) {
		super(driver);
	}

	public void clickPlusButton() {
		click(plus);
	}

	public void clickMinusButton() {
		click(minus);
	}

	public void clickMultiplyButton() {
		click(multiply);
	}

	public void clickDivideButton() {
		click(divide);
	}

	public void clickEqualsButton() {
		click(equals);
	}

	public String getResult() {
		return findElementByAccessibilityId(resultLocator).getText().replaceAll("[^0-9]", "");
	}

	public void enterNumber(int number) {
		int[] digits = splitDigits(number);

		for (int digit : digits) {
			switch (digit) {
			case 0:
				click(zero);
				break;
			case 1:
				click(one);
				break;
			case 2:
				click(two);
				break;
			case 3:
				click(three);
				break;
			case 4:
				click(four);
				break;
			case 5:
				click(five);
				break;
			case 6:
				click(six);
				break;
			case 7:
				click(seven);
				break;
			case 8:
				click(eight);
				break;
			case 9:
				click(nine);
				break;
			}
		}
	}

	private static int[] splitDigits(int number) {

		if (number == 0) {
			return new int[] { 0 };
		} else {
			int count = 0;

			int temp = number;

			while (number != 0) {
				number /= 10;
				count++;
			}

			int[] digits = new int[count];

			int i = digits.length - 1;
			while (temp != 0) {
				digits[i--] = temp % 10;
				temp /= 10;
			}
			return digits;
		}

	}

}
