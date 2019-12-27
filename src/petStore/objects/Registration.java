package petStore.objects;

import java.awt.List;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public static final String REGPAGE_URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	private static final String SACCINFO_XPATH = "//input[@name='newAccount']";
	// User information fields x_paths
	private static final String USERID_XPATH = "//input[@name='username']";
	private static final String NEWPASS_XPATH = "//input[@name='password']";
	private static final String REPEATPASS_XPATH = "//input[@name='repeatedPassword']";
	// Account information fields x_paths
	private static final String FNAME_XPATH = "//input[@name='account.firstName']";
	private static final String LNAME_XPATH = "//input[@name='account.lastName']";
	private static final String EMAIL_XPATH = "//input[@name='account.email']";
	private static final String PHONE_XPATH = "//input[@name='account.phone']";
	private static final String ADRS1_XPATH = "//input[@name='account.address1']";
	private static final String ADRS2_XPATH = "//input[@name='account.address2']";
	private static final String CITY_XPATH = "//input[@name='account.city']";
	private static final String STATE_XPATH = "//input[@name='account.state']";
	private static final String ZIP_XPATH = "//input[@name='account.zip']";
	private static final String COUNTRY_XPATH = "//input[@name='account.country']";
	// Profile information x_paths
	private static final String LANGPREF_XPATH = "//select[@name='account.languagePreference']";
	private static final String FAVCAT_XPATH = "//select[@name='account.favouriteCategoryId']";
	private static final String ENMYLIST_XPATH = "//input[@name='account.listOption']";
	private static final String ENMYBANNER_XPATH = "//input[@name='account.bannerOption']";

	/*** Save account information button get/click methods ***/
	public static WebElement getSaccInfoBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SACCINFO_XPATH));
	}

	public static void clickSaccInfoBtn(WebDriver driver) {
		getSaccInfoBtn(driver).click();
	}

	/*** User information input fields get/click/input/select methods ***/
	// User ID - User name
	public static WebElement getUserName(WebDriver driver) {
		return driver.findElement(By.xpath(USERID_XPATH));
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

	// New password
	public static WebElement getNewPass(WebDriver driver) {
		return driver.findElement(By.xpath(NEWPASS_XPATH));
	}

	public static void clickNewPass(WebDriver driver) {
		getNewPass(driver).click();
	}

	public static String inputNewPass(WebDriver driver, String data) {
		WebElement element = getNewPass(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// Repeat password
	public static WebElement getRepeatPass(WebDriver driver) {
		return driver.findElement(By.xpath(REPEATPASS_XPATH));
	}

	public static void clickRepeatPass(WebDriver driver) {
		getRepeatPass(driver).click();
	}

	public static String inputRepeatedPass(WebDriver driver, String data) {
		WebElement element = getRepeatPass(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	/*** Account information get/click/input methods ***/
	// First name
	public static WebElement getFname(WebDriver driver) {
		return driver.findElement(By.xpath(FNAME_XPATH));
	}

	public static void clickFname(WebDriver driver) {
		getFname(driver).click();
	}

	public static String inputFname(WebDriver driver, String data) {
		WebElement element = getFname(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// Last name
	public static WebElement getLname(WebDriver driver) {
		return driver.findElement(By.xpath(LNAME_XPATH));
	}

	public static void clickLname(WebDriver driver) {
		getLname(driver).click();
	}

	public static String inputLname(WebDriver driver, String data) {
		WebElement element = getLname(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// E-mail
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static String inputEmail(WebDriver driver, String data) {
		WebElement element = getEmail(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// Phone
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(PHONE_XPATH));
	}

	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	public static String inputPhone(WebDriver driver, String data) {
		WebElement element = getPhone(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// Address1
	public static WebElement getAdrs1(WebDriver driver) {
		return driver.findElement(By.xpath(ADRS1_XPATH));
	}

	public static void clickAdrs1(WebDriver driver) {
		getAdrs1(driver).click();
	}

	public static String inputAdrs1(WebDriver driver, String data) {
		WebElement element = getAdrs1(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// Address2
	public static WebElement getAdrs2(WebDriver driver) {
		return driver.findElement(By.xpath(ADRS2_XPATH));
	}

	public static void clickAdrs2(WebDriver driver) {
		getAdrs2(driver).click();
	}

	public static String inputAdrs2(WebDriver driver, String data) {
		WebElement element = getAdrs2(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// City
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(CITY_XPATH));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	public static String inputCity(WebDriver driver, String data) {
		WebElement element = getCity(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// State
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(STATE_XPATH));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	public static String inputState(WebDriver driver, String data) {
		WebElement element = getState(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// Zip
	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath(ZIP_XPATH));
	}

	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}

	public static String inputZip(WebDriver driver, String data) {
		WebElement element = getZip(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	// Country
	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(COUNTRY_XPATH));
	}

	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	public static String inputCountry(WebDriver driver, String data) {
		WebElement element = getCountry(driver);
		element.clear();
		element.sendKeys(data);
		return data;
	}

	/*** Profile information get/select methods ***/
	// Language Preference
	public static Select getLangPref(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGPREF_XPATH)));
	}

	public static void selectLangPref(WebDriver driver, String data) {

		getLangPref(driver).selectByVisibleText(data.toLowerCase());
		if (!data.toLowerCase().equals("english") || !data.toLowerCase().equals("japanese")) {
			System.out.println("Valid data is: \"english\" or \"japanese\"");
		}
	}

	// Favourite Category
	public static Select getFavCat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(FAVCAT_XPATH)));
	}

	public static void selectFavCat(WebDriver driver, String data) {
		getFavCat(driver).selectByVisibleText(data.toUpperCase());
		if (!data.toUpperCase().equals("FISH") || !data.toUpperCase().equals("DOGS")
				|| !data.toUpperCase().equals("REPTILES") || !data.toUpperCase().equals("CATS")
				|| !data.toUpperCase().equals("BIRDS")) {
			System.out.println("Valid data is: \"FISH\" or \"DOGS\" or \"REPTILES\" or \"CATS\" or \"BIRDS\"");
		}
	}

	// Enable Mylist feature
	public static WebElement getENmylist(WebDriver driver) {
		return driver.findElement(By.xpath(ENMYLIST_XPATH));
	}

	public static void enableMylist(WebDriver driver) {
		getENmylist(driver).click();
	}

	// Enable MyBanner feature
	public static WebElement getENmyBanner(WebDriver driver) {
		return driver.findElement(By.xpath(ENMYBANNER_XPATH));
	}

	public static void enableMyBanner(WebDriver driver) {
		getENmyBanner(driver).click();
	}

}
