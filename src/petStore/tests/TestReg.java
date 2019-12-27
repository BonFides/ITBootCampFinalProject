package petStore.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import petStore.objects.HomePage;
import petStore.objects.Registration;
import utility.ExcelUtils;

public class TestReg {

	public static void waitNsec() {
		try {
			Thread.sleep(1400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get(Registration.REGPAGE_URL);
		waitNsec();
		ExcelUtils.setExcell("JPetStoreUsers.xlsx");
		ExcelUtils.setWorkSheet(0);
		for (int i = 0; i < 3; i++) {
			Registration.clickUserName(driver);
			waitNsec();
			Registration.inputUserName(driver, ExcelUtils.getDataAt(1, i));
			waitNsec();
		}

		/*
		 * WebDriver driver = new ChromeDriver(); driver.get(HomePage.URL); waitNsec();
		 * HomePage.getEntStore(driver); waitNsec(); HomePage.clickEntStore(driver);
		 * waitNsec();
		 * 
		 * WebElement element =
		 * driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
		 * element.click(); waitNsec();
		 * 
		 * element =
		 * driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]"));
		 * element.click(); waitNsec();
		 * 
		 * Registration.getENmylist(driver); waitNsec();
		 * Registration.enableMylist(driver);
		 */
	}

}
