package petStore.tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import petStore.objects.HomePage;
import petStore.objects.PetStoreMenu;

public class TestHomePage {

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

		String err404 = "Error 404: Page is not found! Please try again.";

		if (driver.getCurrentUrl().equals(HomePage.URL)) {
			System.out.println("JPetStore home page is opened! Click \"Enter the Store\" to continue.");
		} else
			System.out.printf("\n%s\n", err404);

		driver.manage().window().maximize();
		waitNsec();

		HomePage.getEntStore(driver);
		HomePage.clickEntStore(driver);

		String homePageURL = driver.getCurrentUrl();
		if (homePageURL.equals(PetStoreMenu.MENU_URL)) {
			System.out.println("You entered JPetStore! Choose the pet you always wanted to have.");
		} else
			System.out.println("Error: 404: Page is not found! Please try again.");

	}

}
