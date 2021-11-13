package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class PrintAllGoogleLinks {
	WebDriver driver;

	@Test
	public void printAllGoogleLinks() {
		driver.get("http://www.google.com");
		List<WebElement> allGoogleLinkElements = driver.findElements(By.xpath("//a"));// This
																						// returns
																						// a
																						// list
																						// of
																						// WebElments
/*		driver.findElements(By.cssSelector("a"));// This returns a list of
													// WebElments
		driver.findElements(By.tagName("a"));// This returns a list of
												// WebElments
*/		System.out.println("No. of links on Google home page are " + allGoogleLinkElements.size());
		for (WebElement oneLink : allGoogleLinkElements) {
			System.out.println(oneLink.getText() + " - " + oneLink.getAttribute("href"));
		}

		for (int i = 0; i < allGoogleLinkElements.size(); i++) {
			System.out.println(
					allGoogleLinkElements.get(i).getText() + " - " + allGoogleLinkElements.get(i).getAttribute("href"));
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in Before Class");
		System.setProperty("webdriver.chrome.driver", "F:\\Practice java programs\\webdriverTraining21\\Test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
