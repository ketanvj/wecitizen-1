package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; //It is an interface in java 
		System.setProperty("webdriver.chrome.driver", "F:\\Practice java programs\\webdriverTraining21\\Test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		driver.findElement(By.name("password")).sendKeys("12345");//Method chaining in Java 
		driver.findElement(By.name("username")).submit();//submitting the form. 
		
	//	driver.quit();
		//WebDriver driver = new WebDriver();
	}

}