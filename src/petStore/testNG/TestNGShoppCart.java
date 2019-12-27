package petStore.testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import petStore.objects.PetStoreMenu;
import petStore.objects.PetStoreSignIn;
import petStore.objects.ShoppCart;
import utility.ExcelUtils;

public class TestNGShoppCart {
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
	public static void testShoppCart() {
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		ExcelUtils.setExcell("JPetStoreUsers.xlsx");
		ExcelUtils.setWorkSheet(0);

		driver.get(PetStoreSignIn.SIGNIN_URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		PetStoreSignIn.clickUserName(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String userName = PetStoreSignIn.inputUserName(driver, ExcelUtils.getDataAt(1, 0));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		sa.assertEquals(PetStoreSignIn.getUserName(driver).getAttribute("value"), userName);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		PetStoreSignIn.clickPass(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String pass = PetStoreSignIn.inputPass(driver, ExcelUtils.getDataAt(1, 1));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		sa.assertEquals(PetStoreSignIn.getPass(driver).getAttribute("value"), pass);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		PetStoreSignIn.clickLogin(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		sa.assertTrue(driver.getCurrentUrl().equals(PetStoreMenu.MENU_URL));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		PetStoreMenu.clickTfish(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("FI-SW-01")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//tr[2]//td[5]//a[1]")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		sa.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Shopping Cart')]")).isDisplayed());
		sa.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'Large')]")).isDisplayed());

		sa.assertAll();

	}

}
