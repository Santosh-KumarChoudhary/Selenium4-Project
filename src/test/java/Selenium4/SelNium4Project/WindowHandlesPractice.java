package Selenium4.SelNium4Project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesPractice {
	


	public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Open main page
        driver.get("https://www.qafox.com/selenium/selenium-practice/");

        // Get main window handle
        String mainWindow = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindow);

        // Click first link to open a new window
        WebElement tutorialsNinja = driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/']"));
        tutorialsNinja.click();
        
    WebElement omayo=    driver.findElement(By.xpath("//a[@href='http://omayo.blogspot.in']"));
    omayo.click();
        
        
        
        
        
      //  System.out.println("Switched to Tutorial Ninja Site");

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        
        System.out.println("total window as of now "+allWindows);
        List<String> listWindows = new ArrayList<>(allWindows);
     
        
        for(String wind:listWindows )
        	
        {
        String name=	driver.switchTo().window(wind).getTitle();
        
        if(name.contains("omayo (QAFox.com)"))
        	
        {
        	driver.findElement(By.xpath("//input[@name='q' and @title='search']")).sendKeys("Hello Test");
        	
        	System.out.println("Switched to Omaya site");
        }
        
        else if(name.contains("Your Store"))
        {
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Hey Ninja");
        
        System.out.println("Switched to Ninja Cart");
        }
        
        
        }
        
        driver.switchTo().window(mainWindow);
        
        System.out.println("**Switched to Main Window**");
        

       
    }

}
