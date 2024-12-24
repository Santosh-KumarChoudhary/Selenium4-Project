package Selenium4.SelNium4Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesoriFramesHandling {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
	WebElement frame1=	driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		
	
String frame1Title=	driver.switchTo().frame(frame1).getTitle();

System.out.println("frame1Title "+frame1Title);
	
	WebElement ele=	driver.findElement(By.xpath("//input[@name='mytext1']"));

	ele.sendKeys("san");
	
	//Switching to frame 2\
	
	
	driver.switchTo().defaultContent();
WebElement frame2=	driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));



String frame2Title=driver.switchTo().frame(frame2).getTitle();

System.out.println("Frame 2 name is "+frame2Title);

WebElement ele2=driver.findElement(By.xpath("//input[@name='mytext2']"));

ele2.sendKeys("Santosh");

System.out.println("Switched to Frame 2");

// Switched to main page

driver.switchTo().defaultContent();

String mainpageName=driver.getTitle();
System.out.println(" mainpageName "+mainpageName);



WebElement frame3=	driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));

driver.switchTo().frame(frame3);

WebElement ele3=driver.findElement(By.xpath("//input[@name='mytext3']"));
ele3.sendKeys("Frame 3");

//switching inner frame now

driver.switchTo().frame(0);
driver.findElement(By.xpath("//div[@id='i6']")).click();


System.out.println("Radio button sleected");

driver.switchTo().defaultContent();







	
	
	
	}

}
