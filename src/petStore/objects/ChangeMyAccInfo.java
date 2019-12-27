package petStore.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeMyAccInfo {
	public static final String MYACC_URL = "https://petstore.octoperf.com/actions/Account.action?editAccountForm=";
	
	private static final String MYACC_XPATH = "//a[contains(text(),'My Account')]";
	private static final String SAVEACCINFO_XPATH = "//input[@name='editAccount']";
	
	//Save account information get/click methods
	public static WebElement getSaveAccInfoBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SAVEACCINFO_XPATH));
	}
	
	public static void clickSaveAccInfoBtn(WebDriver driver) {
		getSaveAccInfoBtn(driver).click();
	}
	//My account clickable text
	public static WebElement getMyAccLinkText(WebDriver driver) {
		return driver.findElement(By.xpath(MYACC_XPATH));
	}
	
	public static void clickMyAccTextLink(WebDriver driver) {
		getMyAccLinkText(driver).click();
	}
	
	
	
	
	
}
