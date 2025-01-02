package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownhandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
	WebElement dropdownElements=	driver.findElement(By.xpath("//select[@id='country']"));
	
	//dropdownElements.si
		
		Select sc= new Select(dropdownElements);
	
		
		
		// To select the drop down we have 3 methods
		//selectByVisibleText
		//selectByValue
		//selectByIndex
		
		
		
		//selectByVisibleText
		sc.selectByVisibleText("Germany");
		
		//select by value
		//Thread.sleep(3000);
		sc.selectByValue("india");
		
		//SelectByIndex
		//We don't find under html page, need to pass the index based on UI and their indexing
		
		sc.selectByIndex(9);
		System.out.println("Selecting country at 0 index");
		
		//capture options from the dropdown
		//Use getOptions to get all the options from the drop down
		//Then use .getText to get the Text of the WebElement
		
List<WebElement> allCountriesList=		sc.getOptions();

System.out.println(allCountriesList.size());

for(WebElement list:allCountriesList)
	
{
	String name=list.getText();	
			
	
	System.out.println(name);
}
		
		driver.close();
		
		
		
		
		
		
	}

}
