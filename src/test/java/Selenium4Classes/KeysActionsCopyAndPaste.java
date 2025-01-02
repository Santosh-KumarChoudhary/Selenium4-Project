package Selenium4Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysActionsCopyAndPaste {
public static void main(String[] args) {
	
	
	WebDriver driver= new ChromeDriver();
	
	
	
	Actions act= new Actions(driver);
	
	
	
	
	
	driver.get("https://text-compare.com/");
	
	
	driver.findElement(By.id("inputText1")).sendKeys("Java is awesome!!!!");
	
	act.keyDown(Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).perform();
	
	act.keyDown(Keys.COMMAND).sendKeys("C").keyUp(Keys.COMMAND).perform();
	act.keyDown(Keys.TAB);
	act.keyDown(Keys.COMMAND).sendKeys("V").keyUp(Keys.COMMAND).perform();
	
	
}
}
