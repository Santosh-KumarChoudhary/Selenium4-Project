package Selenium4Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClickAssignments {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
	WebElement field1=	driver.findElement(By.xpath("//input[@id='field1']"));
	
WebElement field2=	driver.findElement(By.xpath("//input[@id='field2']"));

String input="Santosh";

field1.clear();

field1.sendKeys(input);

Actions act = new Actions(driver);



WebElement doclick=driver.findElement(By.xpath("//button[text()='Copy Text']"));





act.doubleClick(doclick).perform();


Thread.sleep(3000);

// Noe performing drag and drop on this page



WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));

WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));

act.dragAndDrop(source,target).perform();

String message=driver.findElement(By.xpath("//div[@id='droppable']//p")).getText();

System.out.println("Double click performed");

System.out.println("Drageed and dropped  and message is "+message);
		
	}

}
