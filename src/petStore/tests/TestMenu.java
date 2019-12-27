package petStore.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import petStore.objects.HomePage;
import petStore.objects.PetStoreMenu;

public class TestMenu {

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

		WebDriver driver = new ChromeDriver();
		driver.get(HomePage.URL);
		waitNsec();
		HomePage.getEntStore(driver);
		waitNsec();
		HomePage.clickEntStore(driver);
		waitNsec();
		PetStoreMenu.getLfish(driver);
		waitNsec();
		PetStoreMenu.clickLfish(driver);

	}

}
