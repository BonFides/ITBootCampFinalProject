package petStore.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenu {
	// Menu page elements URLs
	public static final String MENU_URL = "https://petstore.octoperf.com/actions/Catalog.action";
	public static final String FISH_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String DOGS_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String REPTILES_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String CATS_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String BIRDS_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String HELPPAGE_URL = "https://petstore.octoperf.com/help.html";

	// Left menu items x_paths
	private static final String LEFTFISH_XPATH = "//div[@id='Content']//a[1]//img[1]";
	private static final String LEFTDOGS_XPATH = "//div[@id='Content']//a[2]//img[1]";
	private static final String LEFTCATS_XPATH = "//div[@id='Content']//a[3]//img[1]";
	private static final String LEFTREPTILES_XPATH = "//div[@id='Content']//a[4]//img[1]";
	private static final String LEFTBIRDS_XPATH = "//div[@id='Content']//a[5]//img[1]";
	// Top menu items x_paths
	private static final String TOPFISH_XPATH = "//div[@id='QuickLinks']//a[1]//img[1]";
	private static final String TOPDOGS_XPATH = "//div[@id='Header']//a[2]//img[1]";
	private static final String TOPREPTILES_XPATH = "//div[@id='Header']//a[3]//img[1]";
	private static final String TOPCATS_XPATH = "//div[@id='Header']//a[4]//img[1]";
	private static final String TOPBIRDS_XPATH = "//div[@id='Header']//a[5]//img[1]";
	// Central menu items x_paths
	private static final String CENTRALMENULOGO_XPATH = "//body//area[1]";
	private static final String CENTRALFISH_XPATH = "//body//area[2]";
	private static final String CENTRALDOGS_XPATH = "//body//area[3]";
	private static final String CENTRALREPTILES_XPATH = "//body//area[4]";
	private static final String CENTRALCATS_XPATH = "//body//area[5]";
	private static final String CENTRALBIRDS_XPATH = "//body//area[6]";
	// HEADER elements x_paths
	private static final String HEADERLOGO_XPATH = "//div[@id='LogoContent']//a//img";
	private static final String HEADERCART_XPATH = "//img[@name='img_cart']";
	private static final String HEADERHELPPAGE_XPATH = "//a[contains(text(),'?')]";
	private static final String HEADERSRCHFIELD_XPATH = "//input[@name='keyword']";
	private static final String HEADERSRCHBTN_XPATH = "//input[@name='searchProducts']";

	/*** HEADER elements get/click/input methods ***/
	/*** LEFT menu items get/click methods ***/

	// Fish
	public static WebElement getLfish(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTFISH_XPATH));
	}

	public static void clickLfish(WebDriver driver) {
		getLfish(driver).click();
	}

	// Dogs
	public static WebElement getLdogs(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTDOGS_XPATH));
	}

	public static void clickLdogs(WebDriver driver) {
		getLdogs(driver).click();
	}

	// Cats
	public static WebElement getLcats(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTCATS_XPATH));
	}

	public static void clickLcats(WebDriver driver) {
		getLcats(driver).click();
	}

	// Reptiles
	public static WebElement getLreptiles(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTREPTILES_XPATH));
	}

	public static void clickLreptiles(WebDriver driver) {
		getLreptiles(driver).click();
	}

	// Birds
	public static WebElement getLbirds(WebDriver driver) {
		return driver.findElement(By.xpath(LEFTBIRDS_XPATH));
	}

	public static void clickLbirds(WebDriver driver) {
		getLbirds(driver).click();
	}

	/*** TOP menu items get/click methods ***/

	// Fish
	public static WebElement getTfish(WebDriver driver) {
		return driver.findElement(By.xpath(TOPFISH_XPATH));
	}

	public static void clickTfish(WebDriver driver) {
		getTfish(driver).click();
	}

	// Dogs
	public static WebElement getTdogs(WebDriver driver) {
		return driver.findElement(By.xpath(TOPDOGS_XPATH));
	}

	public static void clickTdogs(WebDriver driver) {
		getTdogs(driver).click();
	}

	// Reptiles
	public static WebElement getTreptiles(WebDriver driver) {
		return driver.findElement(By.xpath(TOPREPTILES_XPATH));
	}

	public static void clickTreptiles(WebDriver driver) {
		getTreptiles(driver).click();
	}

	// Cats
	public static WebElement getTcats(WebDriver driver) {
		return driver.findElement(By.xpath(TOPCATS_XPATH));
	}

	public static void clickTcats(WebDriver driver) {
		getTcats(driver).click();
	}

	// Birds
	public static WebElement getTbirds(WebDriver driver) {
		return driver.findElement(By.xpath(TOPBIRDS_XPATH));
	}

	public static void clickTbirds(WebDriver driver) {
		getTbirds(driver).click();
	}

	/*** CENTRAL menu items get/click methods ***/

	// JPetShop bird logo
	public static WebElement getClogo(WebDriver driver) {
		return driver.findElement(By.xpath(CENTRALMENULOGO_XPATH));
	}

	public static void clickClogo(WebDriver driver) {
		getClogo(driver).click();
	}

	// Fish
	public static WebElement getCfish(WebDriver driver) {
		return driver.findElement(By.xpath(CENTRALFISH_XPATH));
	}

	public static void clickCfish(WebDriver driver) {
		getCfish(driver).click();
	}

	// Dogs
	public static WebElement getCdogs(WebDriver driver) {
		return driver.findElement(By.xpath(CENTRALDOGS_XPATH));
	}

	public static void clickCdogs(WebDriver driver) {
		getCdogs(driver).click();
	}

	// Reptiles
	public static WebElement getCreptiles(WebDriver driver) {
		return driver.findElement(By.xpath(CENTRALREPTILES_XPATH));
	}

	public static void clickCreptiles(WebDriver driver) {
		getCreptiles(driver).click();
	}

	// Cats
	public static WebElement getCcats(WebDriver driver) {
		return driver.findElement(By.xpath(CENTRALCATS_XPATH));
	}

	public static void clickCcats(WebDriver driver) {
		getCcats(driver).click();
	}

	// Birds
	public static WebElement getCbirds(WebDriver driver) {
		return driver.findElement(By.xpath(CENTRALBIRDS_XPATH));
	}

	public static void clickCbirds(WebDriver driver) {
		getCbirds(driver).click();
	}

	/*** HEADER elements get/click/input methods ***/
	// JPetStore logo
	public static WebElement getHlogo(WebDriver driver) {
		return driver.findElement(By.xpath(HEADERLOGO_XPATH));
	}

	public static void clickHlogo(WebDriver driver) {
		getHlogo(driver).click();
	}

	// Shopping cart
	public static WebElement getHcart(WebDriver driver) {
		return driver.findElement(By.xpath(HEADERCART_XPATH));
	}

	public static void clickHcart(WebDriver driver) {
		getHcart(driver).click();
	}

	// Help page "?"
	public static WebElement getHhelpPage(WebDriver driver) {
		return driver.findElement(By.xpath(HEADERHELPPAGE_XPATH));
	}

	public static void clickHhelpPage(WebDriver driver) {
		getHhelpPage(driver).click();
	}

	// Search input field
	public static WebElement getHsrchField(WebDriver driver) {
		return driver.findElement(By.xpath(HEADERSRCHFIELD_XPATH));
	}

	public static void clickHsrchField(WebDriver driver) {
		getHsrchField(driver).click();
	}

	public static void inputHsrchField(WebDriver driver, String data) {
		getHsrchField(driver).sendKeys(data);
	}

	// Search button
	public static WebElement getHsrchBtn(WebDriver driver) {
		return driver.findElement(By.xpath(HEADERSRCHBTN_XPATH));
	}

	public static void clickHsrchBtn(WebDriver driver) {
		getHsrchBtn(driver).click();
	}

}
