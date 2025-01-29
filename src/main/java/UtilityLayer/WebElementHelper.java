package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass {

	public static void sendKeys(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			WaitHelper.visibilityOf(wb).sendKeys(value);
		}

	}

	public static void click(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			WaitHelper.visibilityOf(wb).click();
		}
	}
	public static String getText(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			return WaitHelper.visibilityOf(wb).getText();
		}
		return null;
	}
}
