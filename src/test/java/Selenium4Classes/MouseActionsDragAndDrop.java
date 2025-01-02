package Selenium4Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	//WebDriverManager
	
	WebDriver driver= new ChromeDriver();
	
	
	
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	
	
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	Actions act= new Actions(driver);
	
	WebElement source1=driver.findElement(By.xpath("//div[@id='box1']"));
	
WebElement target1=	driver.findElement(By.xpath("//div[@id='box101']"));

act.dragAndDrop(source1, target1).perform();
Thread.sleep(3000);

WebElement Rome =driver.findElement(By.xpath("//div[@id='box6']"));

WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));

act.dragAndDrop(Rome, italy).perform();

System.out.println("");
	
	
	
	//First identify the source and target to perform drag and drop
	
	
	
	

}
}