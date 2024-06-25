package com.test.calc;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.screens.CalcScreen;
import com.screens.ChromeScreen;

public class CalcTest extends BaseTest {

	
	@Test
	public void chrome() {
		ChromeScreen chrome = new ChromeScreen(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chrome.enterURL("http://corpwldevflz2:7777/forms/frmservlet?config=CMPSLCUTRN&ClientDPI=100");
	}
	
//	@Test
	public void testAddition() {
		CalcScreen calc = new CalcScreen(driver);
//		calc.enterNumber(1908);
//		calc.clickPlusButton();
//		calc.enterNumber(1908);
//		calc.clickMinusButton();
//		calc.enterNumber(1908);
//		calc.clickEqualsButton();
//		String result = calc.getResult();
//
//		Assert.assertEquals(Integer.parseInt(result), 1908);
//		calc.clickRestore();
		
		
	}

}
