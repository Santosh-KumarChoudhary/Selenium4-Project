package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	
	static void futureDateSelection(WebDriver driver, String expecMonth, String expeYear  , String expecdate ) throws InterruptedException
	
	{
		while(true)
			
		{
			String month=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year=	driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equals(expecMonth) && year.equals(expeYear))
				
			{
				Thread.sleep(3000);
				
				System.out.println(month +" "+year);
				
				System.out.println("MATCHED");
				break;
			}
			
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click(); //Future date 
			
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //past date selecetion

		}
		
		
	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:dates)
			
		{
			if(dt.getText().equals(expecdate))
				
			{
				dt.click();
				System.out.println(dt.getText() +" is selected");
				
				break;
			}
		}
	}
	
	
static void pastDateSelection(WebDriver driver, String expecMonth, String expeYear  , String expecdate ) throws InterruptedException
	
	{
		while(true)
			
		{
			String month=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year=	driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equals(expecMonth) && year.equals(expeYear))
				
			{
				Thread.sleep(3000);
				
				System.out.println(month +" "+year);
				
				System.out.println("MATCHED");
				break;
			}
			
			//driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click(); //Future date 
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //past date selecetion

		}
		
		
	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:dates)
			
		{
			if(dt.getText().equals(expecdate))
				
			{
				dt.click();
				System.out.println(dt.getText() +" is selected");
				
				break;
			}
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.get("https://jqueryui.com/datepicker/");
		
		
		
		String expeYear="2026";
		
		String expecMonth="March";
		
		String expecdate="2";
		
		
		
		driver.switchTo().frame(0);
		
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
		
		//pastDateSelection(driver,expecMonth,expeYear, expecdate);

	
	//System.out.println("Month "+month +"year "+year);
	
	
	
		futureDateSelection(driver,expecMonth ,expeYear,expecdate);
		
		System.out.println("*************EXECUTION OVER****************");
	
	//driver.close();
	

	
	}

}
