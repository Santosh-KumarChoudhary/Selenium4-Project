package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTablePrac {
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");

	int columnCount=	driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	
	System.out.println("columnCount is "+columnCount);
	
	int rowCount=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	
	System.out.println(" rowCount :"+rowCount);
	
	String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[2]")).getText();
	
	System.out.println("value "+value);
	
List<WebElement >ele=	driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]"));



for(WebElement el:ele)
	
{
	System.out.println("Elements are "+el.getText());
}	


System.out.println("BookName " + " Author "+" Subject "+" Price");

for(int i=2;i<rowCount;i++)
	
{
	for(int j=1;j<=columnCount ;j++)
		
	{
		
String allOption=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
	System.out.print(allOption+"\t");
	
	}
	System.out.println();
}
	
System.out.println("**********************8Execution Over ******************************");
	
	driver.close();
		
		
	}

}
