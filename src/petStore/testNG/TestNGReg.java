package petStore.testNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import petStore.objects.PetStoreMenu;
import petStore.objects.Registration;
import utility.ExcelUtils;

public class TestNGReg {
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
	public static void testReg() {
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get(Registration.REGPAGE_URL);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		ExcelUtils.setExcell("JPetStoreUsers.xlsx");
		ExcelUtils.setWorkSheet(0);

		String[] catTitles = { "FISH", "DOGS", "REPTILES", "CATS", "BIRDS" };

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {

			Registration.clickUserName(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String userName = Registration.inputUserName(driver, ExcelUtils.getDataAt(i, 0));
			sa.assertEquals(Registration.getUserName(driver).getAttribute("value"), userName);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickNewPass(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String newPass = Registration.inputNewPass(driver, ExcelUtils.getDataAt(i, 1));
			sa.assertEquals(Registration.getNewPass(driver).getAttribute("value"), newPass);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickRepeatPass(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String repPass = Registration.inputRepeatedPass(driver, ExcelUtils.getDataAt(i, 1));
			sa.assertEquals(Registration.getRepeatPass(driver).getAttribute("value"), repPass);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickFname(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String fName = Registration.inputFname(driver, ExcelUtils.getDataAt(i, 2));
			sa.assertEquals(Registration.getFname(driver).getAttribute("value"), fName);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickLname(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String lName = Registration.inputLname(driver, ExcelUtils.getDataAt(i, 3));
			sa.assertEquals(Registration.getLname(driver).getAttribute("value"), lName);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickEmail(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String eMail = Registration.inputEmail(driver, ExcelUtils.getDataAt(i, 4));
			sa.assertEquals(Registration.getEmail(driver).getAttribute("value"), eMail);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickPhone(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String phone = Registration.inputPhone(driver, ExcelUtils.getDataAt(i, 5));
			sa.assertEquals(Registration.getPhone(driver).getAttribute("value"), phone);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickAdrs1(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String adrs1 = Registration.inputAdrs1(driver, ExcelUtils.getDataAt(i, 6));
			sa.assertEquals(Registration.getAdrs1(driver).getAttribute("value"), adrs1);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickAdrs2(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String adrs2 = Registration.inputAdrs2(driver, ExcelUtils.getDataAt(i, 7));
			sa.assertEquals(Registration.getAdrs2(driver).getAttribute("value"), adrs2);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickCity(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String city = Registration.inputCity(driver, ExcelUtils.getDataAt(i, 8));
			sa.assertEquals(Registration.getCity(driver).getAttribute("value"), city);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickState(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String state = Registration.inputState(driver, ExcelUtils.getDataAt(i, 9));
			sa.assertEquals(Registration.getState(driver).getAttribute("value"), state);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickZip(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String zip = Registration.inputZip(driver, ExcelUtils.getDataAt(i, 10));
			sa.assertEquals(Registration.getZip(driver).getAttribute("value"), zip);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.clickCountry(driver);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			String country = Registration.inputCountry(driver, ExcelUtils.getDataAt(i, 11));
			sa.assertEquals(Registration.getCountry(driver).getAttribute("value"), country);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.selectLangPref(driver, "English");
			waitNsec();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			Registration.selectFavCat(driver, "dogs");
			waitNsec();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			if (i % 3 == 0) {
				Registration.enableMylist(driver);
				waitNsec();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

				Registration.enableMyBanner(driver);
				waitNsec();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

				Random rand = new Random();
				int x = rand.nextInt(5);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				Registration.selectFavCat(driver, catTitles[x]);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			}

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			Registration.clickSaccInfoBtn(driver);
			waitNsec();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			sa.assertTrue(driver.getCurrentUrl().equals(PetStoreMenu.MENU_URL));
			if (driver.getCurrentUrl().equals(PetStoreMenu.MENU_URL)) {
				ExcelUtils.setDataAt(i, 12, "User registered!");
			}
			waitNsec();
			waitNsec();
			driver.get(Registration.REGPAGE_URL);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			sa.assertAll();
		}

	}

}
