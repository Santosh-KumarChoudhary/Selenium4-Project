package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KapurkaSiteTableChallenges {
	
	
	@Test(priority=1)
	
	public void setUp()
	
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.kapruka.com/online/samedaydelivery");
		
		
	List<WebElement> rows=	driver.findElements(By.xpath("//div[@class='Rebrand_table space-bot']//tbody//tr"));
	
	System.out.println(rows.size());
				
		
		for(int i =2; i<=rows.size();i++)
		{
		String tableData=	driver.findElement(By.xpath("//div[@class='Rebrand_table space-bot']//tbody//tr["+i+"]")).getText();
		
		System.out.println(tableData +" ");
	}
		
		driver.close();
		
		
	}

}
