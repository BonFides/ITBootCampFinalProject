package petStore.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import petStore.objects.PetStoreMenu;
import petStore.objects.PetStoreSignIn;
import petStore.objects.Registration;
import utility.ExcelUtils;

public class TestNGSignIn {
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
	public static void testSignIn() {
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		ExcelUtils.setExcell("JPetStoreUsers.xlsx");
		ExcelUtils.setWorkSheet(0);
		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			driver.get(PetStoreSignIn.SIGNIN_URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			PetStoreSignIn.clickUserName(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String userName = PetStoreSignIn.inputUserName(driver, ExcelUtils.getDataAt(i, 0));
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			sa.assertEquals(PetStoreSignIn.getUserName(driver).getAttribute("value"), userName);

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			PetStoreSignIn.clickPass(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String pass = PetStoreSignIn.inputPass(driver, ExcelUtils.getDataAt(i, 1));
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			sa.assertEquals(PetStoreSignIn.getPass(driver).getAttribute("value"), pass);

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			PetStoreSignIn.clickLogin(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			sa.assertTrue(driver.getCurrentUrl().equals(PetStoreMenu.MENU_URL));
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			PetStoreSignIn.clickSignOut(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			sa.assertTrue(driver.getCurrentUrl().equals(PetStoreMenu.MENU_URL));

			sa.assertAll();
		}

	}

}
