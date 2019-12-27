package petStore.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static final String URL = "https://petstore.octoperf.com/";
	private static final String ENTSTORE_XPATH = "//a[contains(text(),'Enter the Store')]";

	// Enter store
	public static WebElement getEntStore(WebDriver driver) {
		return driver.findElement(By.xpath(ENTSTORE_XPATH));
	}

	public static void clickEntStore(WebDriver driver) {
		getEntStore(driver).click();
	}

}
