package Selenium4Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTableAssignments {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	//get number of rows
	
//int totalPages=	driver.findElements(By.xpath("//ul[@class='pagination']//*[text()='1']")).size();

//System.out.println("totalPages "+totalPages);
	
	int count=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();

for(int i=1;i<=4;i++)
	
{
	if(i>1)
	{
	
		driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+i+"]")).click();
		Thread.sleep(3000);
		
	}
	
	
for(int row=1;row<=count;row++)
	
{
	//for()int 
	
	// clicking on the name column
String name=	driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+row+"]//td[2]")).getText();
String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+row+"]//td[3]")).getText().replace("$", "");
driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+row+"]//td[4]//input[@type='checkbox']")).click();

boolean isselected= driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+row+"]//td[4]//input[@type='checkbox']")).isSelected();


Thread.sleep(1000);
	
System.out.println(name +"\t"+price + isselected);
	
}
	
}	//sysodriver.close();
	}

}
