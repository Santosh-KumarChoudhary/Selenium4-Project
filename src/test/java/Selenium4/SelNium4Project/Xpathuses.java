package Selenium4.SelNium4Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathuses {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("//select[@name='customerCurrency']")).click();
		
		//driver.findElement(By.xpath("//input[@name='q'][@id='small-searchterms']")).sendKeys("Hello");
driver.findElement(By.xpath("//*[contains(@id,'small-searchterms')]"))	.sendKeys("hello");	
		
		//driver.findElement(By.xpath("//a[text()='Apple MacBook Pro 13-inch']")).click();
		
//	String text=	driver.findElement(By.xpath("//div[text()='Categories']")).getText();

boolean flag= driver.findElement(By.xpath("//div[@class=\"header-lower\"]/div/a/img")).isDisplayed();

System.out.println("Is Displayed "+flag);
	
	//System.out.println("Text is "+text);
		
		
		System.out.println("Execution completed");

}
}