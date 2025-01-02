package Selenium4Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("/Users/macos/Downloads/Info.txt");
		
		
		if(
		driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Info.txt"))
		
		{
			System.out.println("File uploaded succesfully");
		}
		
		else
		{
			System.out.println("Failed to upload");
			
			
			
	
		}
		
		
		//Multi files upload at a time
		
		String file1="/Users/macos/Downloads/Info.txt";
		
		String file2="/Users/macos/Downloads/Attach.png";
		
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
	int numberOffiles=	driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	
	if(numberOffiles==2)
		
	{
		System.out.println("2 files have been uploaded");
	}
	
	else
	{
		System.out.println("Failed to upload");
	}

	System.out.println("Execution Over");
		
		
		
		
	}

}
