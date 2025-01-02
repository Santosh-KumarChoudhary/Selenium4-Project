package Selenium4Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDragAnddropChallenge {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	WebElement source1=	driver.findElement(By.xpath("//li[@id='fourth'][1]"));
	
	WebElement taerget1=driver.findElement(By.xpath("//ol[@id='amt7']"));
	
	
	Actions act = new Actions(driver);
	
	
	
	act.dragAndDrop(source1, taerget1).perform();
	
	System.out.println();

	}

}
