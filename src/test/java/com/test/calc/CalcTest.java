package com.test.calc;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.screens.CalcScreen;

public class CalcTest extends BaseTest {

	@Test
	public void testAddition() {
		CalcScreen calc = new CalcScreen(driver);
		calc.enterNumber(1908);
		calc.clickPlusButton();
		calc.enterNumber(1908);
		calc.clickMinusButton();
		calc.enterNumber(1908);
		calc.clickEqualsButton();
		String result = calc.getResult();

		Assert.assertEquals(Integer.parseInt(result), 1908);
	}

}
