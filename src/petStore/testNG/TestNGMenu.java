package petStore.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import petStore.objects.PetStoreMenu;
import petStore.objects.ShoppCart;

public class TestNGMenu {
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

	@Test(priority = 3)
	public static void testLeftMenu() {
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getLfish(driver);
		waitNsec();
		PetStoreMenu.clickLfish(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl().contains("FISH"), true);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getLdogs(driver);
		waitNsec();
		PetStoreMenu.clickLdogs(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.DOGS_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getLcats(driver);
		waitNsec();
		PetStoreMenu.clickLcats(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.CATS_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getLreptiles(driver);
		waitNsec();
		PetStoreMenu.clickLreptiles(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.REPTILES_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getLbirds(driver);
		waitNsec();
		PetStoreMenu.clickLbirds(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.BIRDS_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		sa.assertAll();
	}

	@Test(priority = 4)
	public static void testTopMenu() {
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getTfish(driver);
		waitNsec();
		PetStoreMenu.clickTfish(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl().contains("FISH"), true);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getTdogs(driver);
		waitNsec();
		PetStoreMenu.clickTdogs(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.DOGS_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getTreptiles(driver);
		waitNsec();
		PetStoreMenu.clickTreptiles(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.REPTILES_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getTcats(driver);
		waitNsec();
		PetStoreMenu.clickCcats(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.CATS_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.getTbirds(driver);
		waitNsec();
		PetStoreMenu.clickTbirds(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.BIRDS_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		sa.assertAll();
	}

	@Test(priority = 2)
	public static void testCentralMenu() {
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickCfish(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl().contains("FISH"), true);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickCdogs(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.DOGS_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickCreptiles(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.REPTILES_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickCcats(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.CATS_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickCbirds(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.BIRDS_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickClogo(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.MENU_URL);
		sa.assertAll();
	}

	@Test(priority = 1)
	public static void testHeadElements() {
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickHlogo(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.MENU_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickHcart(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), ShoppCart.SHOPCART_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickHhelpPage(driver);
		waitNsec();
		sa.assertEquals(driver.getCurrentUrl(), PetStoreMenu.HELPPAGE_URL);
		waitNsec();
		driver.get(PetStoreMenu.MENU_URL);
		waitNsec();
		PetStoreMenu.clickHsrchField(driver);
		waitNsec();
		PetStoreMenu.inputHsrchField(driver, "koi");
		waitNsec();
		PetStoreMenu.clickHsrchBtn(driver);
		waitNsec();
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Fresh Water fish from Japan')]")).isDisplayed());
	}
}
