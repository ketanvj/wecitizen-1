package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MyFirstTestNGTest {
	WebDriver driver;
 
  

  @BeforeClass
  
	  public void preConditionsForAllTest()
	  {
		  System.out.println("I am in Before Class");
		  System.setProperty("webdriver.chrome.driver", "F:\\Practice java programs\\webdriverTraining21\\Test\\resources\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
  
	

	  @AfterClass
	  
	  public void cleanUpAfterAllTestsAreExecuted()
	  {
		 System.out.println("I am in After class");
		 driver.quit();
	  }

      @BeforeMethod
     
	  public void beforeMethod() 
	  {
		System.out.println("I am in Before Method");
	  }

	  @AfterMethod
	  
	  public void afterMethod()
	  {
			System.out.println("I am in After Method");
	  }

	  @Test
	  	//Test
		  public void testNicheThyselfLogin() {
				System.out.println("I  am in Test");
				driver.get("https://nichethyself.com/tourism/home.html");
				WebElement user = driver.findElement(By.name("username"));
				System.out.println("Tag of username is " + user.getTagName());
				System.out.println("type attrubute of username is " + user.getAttribute("type"));
				System.out.println("Name attrubute of username is " + user.getAttribute("name"));
				System.out.println("Placeholder attrubute of username is " + user.getAttribute("placeholder"));
				user.sendKeys("stc123");
				driver.findElement(By.name("password")).sendKeys("12345");// Method
																			// chaining
																			// in Java
				driver.findElement(By.name("username")).submit();// submitting the form.

				String expectedTitle = "My account";
				String actualTitle = driver.getTitle();

				/*
				 * if (expectedTitle.equals(actualTitle))
				 * System.out.println("Test Case Passed"); else
				 * System.out.println("Test Case Failed");
				 */		
				assertEquals(actualTitle, expectedTitle);
	  }

}
