package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownLea {
	
	
	@Test
	public void handleDropDown() throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
	WebElement all=	driver.findElement(By.xpath("//select[@id='country']"));
Select sc= new Select(all);

List<WebElement> option=sc.getOptions();


for(WebElement op: option)
{
	System.out.println(op.getText());
}



Thread.sleep(3000);


driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
List <WebElement> drop=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));

for(WebElement list2: drop)
	
{
	System.out.println(list2.getText());
}



		
	}
	
	

}
