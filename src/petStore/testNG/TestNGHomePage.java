package petStore.testNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import petStore.objects.HomePage;
import petStore.objects.PetStoreMenu;

public class TestNGHomePage {
	@BeforeClass
	public static void setPreCond() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	}

	@BeforeMethod
	public static void waitNsec() {
		try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterMethod
	public static void waitNSec() {
		try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public static void testEnterClick() {
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get(HomePage.URL);
		sa.assertEquals(driver.getCurrentUrl(), HomePage.URL);
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Enter the Store')]")).isEnabled());
		HomePage.clickEntStore(driver);
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.MENU_URL);
		sa.assertAll();
	}
}
