package Selenium4Classes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotManager {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		
		
	//	TakesScreenshot sc=(TakesScreenshot) driver;
		
		
		// 1st approach to capture full page screen shot 
//	File sourceFile=	sc.getScreenshotAs(OutputType.FILE);
//	
//		
//	
//	File targetFile= new File(System.getProperty("user.dir")+"/Screnshots/Fullscreen.png");
//	
//	sourceFile.renameTo(targetFile);
		
		
		
		
		
		
		//Capture screen shot of the specific section 
		
		
		//here we will .getSceeshotAs(OutType.FILE) method od the WebElement interface not of the
		// TakesScreenshot interface
//		
	WebElement ele=	driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//	
//File source=	ele.getScreenshotAs(OutputType.FILE);
//
//File target= new File(System.getProperty("user.dir")+"Screnshots/specificsection.png");
//
//source.renameTo(target);
		
		
		File source=	ele.getScreenshotAs(OutputType.FILE);
	//	
//			
	//	
		File target= new File(System.getProperty("user.dir")+"/Screnshots/Featurescreen2.png");
	//	
	source.renameTo(target);

System.out.println("Execution Over");

		
		
	driver.close();
	
	}

}
