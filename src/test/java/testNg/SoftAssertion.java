package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	
	@Test
	public void login()
	
	{
	
		
		System.out.println("looged in");
		
		System.out.println("Moving ahead");
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//Account Login
		SoftAssert soft= new SoftAssert();
		
		soft.assertEquals(driver.getTitle(), "Account Logins" ,"Incorrect Title");
		
		
		//soft.assertEquals(12, 13);
		
		System.out.println("After assertion");
		
		soft.assertAll();
		driver.quit();
	}

}
