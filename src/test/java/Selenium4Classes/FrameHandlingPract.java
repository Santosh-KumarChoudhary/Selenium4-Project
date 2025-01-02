package Selenium4Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlingPract {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
	WebElement frame1=	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	
String frame1Title=	driver.switchTo().frame(frame1).getTitle();

System.out.println("frame1Title "+frame1Title);

driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Santosh");

System.out.println("Text entered");



driver.switchTo().defaultContent();

WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
driver.switchTo().frame(frame2);
driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Sending text in Frame 2");

System.out.println("text entered in Frame 2");



//driver.close();
		
		
	}

}
