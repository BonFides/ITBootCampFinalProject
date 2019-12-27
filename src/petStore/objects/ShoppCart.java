package petStore.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppCart {
	// URL for pages from Shopping cart to successful order
	public static final String SHOPCART_URL = "https://petstore.octoperf.com/actions/Cart.action?viewCart=";
	public static final String SUCCORDERPAGE3_URL = "https://petstore.octoperf.com/actions/Order.action?newOrder=&confirmed=true";
	public static final String CONFORDERPAGE2_URL = "https://petstore.octoperf.com/actions/Order.action";
	public static final String CONTINUEORDERPAGE1_URL = "https://petstore.octoperf.com/actions/Order.action?newOrderForm=";
	// Xpaths for Shopping Cart buttons
	// private static final String UPDATECART_XPATH =
	// "//input[@name='updateCartQuantities']";
	// private static final String REMOVEITEM_XPATH =
	// "//a[contains(text(),'Remove')]";
	private static final String PROCTOCHECK_XPATH = "//a[contains(text(),'Proceed to Checkout')]";
	private static final String CONTINUE_XPATH = "//input[@name='newOrder']";
	private static final String CONFIRM_XPTH = "//a[@class='Button']";

	/*** Shopping Cart get/click methods ***/
	// Proceed to Checkout button
	public static WebElement getProceedBtn(WebDriver driver) {
		return driver.findElement(By.xpath(PROCTOCHECK_XPATH));
	}

	public static void clickProceedBtn(WebDriver driver) {
		getProceedBtn(driver).click();
	}

	// Continue button
	public static WebElement getContinue(WebDriver driver) {
		return driver.findElement(By.xpath(CONTINUE_XPATH));
	}

	public static void clickContinue(WebDriver driver) {
		getContinue(driver).click();
	}

	// Confirm button
	public static WebElement getConfirm(WebDriver driver) {
		return driver.findElement(By.xpath(CONFIRM_XPTH));
	}

	public static void clickConfirm(WebDriver driver) {
		getConfirm(driver).click();
	}

}
