package petStore.testNG;

import java.util.concurrent.TimeUnit;

import javax.swing.text.ChangedCharSetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import petStore.objects.ChangeMyAccInfo;
import petStore.objects.PetStoreMenu;
import petStore.objects.PetStoreSignIn;
import petStore.objects.Registration;
import utility.ExcelUtils;

public class TestNGChangeMyAccInfo {
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

	// Test is conducted while user is logged in
	@Test(priority = 1)
	public static void testChangeMyAccInfo() {
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

		ExcelUtils.setWorkSheet(1);

		ChangeMyAccInfo.clickMyAccTextLink(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Registration.clickNewPass(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String newPass = Registration.inputNewPass(driver, ExcelUtils.getDataAt(1, 0));
		sa.assertEquals(Registration.getNewPass(driver).getAttribute("value"), newPass);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Registration.clickRepeatPass(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String repPass = Registration.inputRepeatedPass(driver, ExcelUtils.getDataAt(1, 0));
		sa.assertEquals(Registration.getRepeatPass(driver).getAttribute("value"), repPass);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Registration.clickCity(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String city = Registration.inputCity(driver, ExcelUtils.getDataAt(1, 1));
		sa.assertEquals(Registration.getCity(driver).getAttribute("value"), city);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		ChangeMyAccInfo.clickSaveAccInfoBtn(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		PetStoreMenu.clickHlogo(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		ChangeMyAccInfo.clickMyAccTextLink(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		sa.assertEquals(Registration.getNewPass(driver).getAttribute("value"), ExcelUtils.getDataAt(1, 0));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		sa.assertEquals(Registration.getCity(driver), ExcelUtils.getDataAt(1, 1));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		PetStoreSignIn.clickSignOut(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	// Test is conducted after user signed out
	@Test(priority = 2)
	public static void testChangeMyAccInfoAfterSO() {
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		ExcelUtils.setExcell("JPetStoreUsers.xlsx");
		ExcelUtils.setWorkSheet(0);

		driver.get(PetStoreMenu.MENU_URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		PetStoreSignIn.clickSignInText(driver);
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

		ChangeMyAccInfo.clickMyAccTextLink(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		sa.assertEquals(Registration.getNewPass(driver).getAttribute("value"), ExcelUtils.getDataAt(1, 0));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		sa.assertEquals(Registration.getCity(driver), ExcelUtils.getDataAt(1, 1));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		PetStoreSignIn.clickSignOut(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

}
