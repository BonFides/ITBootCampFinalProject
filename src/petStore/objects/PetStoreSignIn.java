package petStore.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreSignIn {
	public static final String SIGNIN_URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	private static final String SIGNIN_XPATH = "//a[contains(text(),'Sign In')]";
	private static final String USERNAME_XPATH = "//input[@name='username']";
	private static final String PASS_XPATH = "//input[@name='password']";
	private static final String LOGIN_XPATH = "//input[@name='signon']";
	private static final String SINGOUT_XPATH = "//a[contains(text(),'Sign Out')]";

	/*** Sign in text ***/
	public static WebElement getSignInText(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN_XPATH));
	}

	public static void clickSignInText(WebDriver driver) {
		getSignInText(driver).click();
	}

	/*** SIGN IN PAGE get/click/input methods ***/
	// User name
	public static WebElement getUserName(WebDriver driver) {
		return driver.findElement(By.xpath(USERNAME_XPATH));
	}

	public static void clickUserName(WebDriver driver) {
		getUserName(driver).click();
	}

	public static String inputUserName(WebDriver driver, String data) {
		WebElement element = getUserName(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// Password
	public static WebElement getPass(WebDriver driver) {
		return driver.findElement(By.xpath(PASS_XPATH));
	}

	public static void clickPass(WebDriver driver) {
		getPass(driver).click();
	}

	public static String inputPass(WebDriver driver, String data) {
		WebElement element = getPass(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// Log in
	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	/*** SING OUT button get/click methods ***/
	// Log out
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SINGOUT_XPATH));
	}

	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}

}
