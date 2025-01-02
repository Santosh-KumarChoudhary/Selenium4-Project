package Selenium4Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorScrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//scrolling the page by pixels
		
//		js.executeScript("window.scrollBy(0,1500)","");
//		
//		//getting the length of the scrolled page
//		
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//  2nd approach ,  Scroll till find the visibility of the element
		
		// First locate the element which is need to locate on page
		
		
		
//	WebElement ele=	driver.findElement(By.id("vote-poll-1"));
//		
//		
//	
//	js.executeScript("arguments[0].scrollIntoView()", ele);
//	
//
//	System.out.println(js.executeScript("return window.pageYOffset;"));
//	
//	
//	System.out.println(ele.isDisplayed());
//	
//	System.out.println("**** Execution Over ****************");
//		
		// ************************************//
	
	
	// Third approach , scroll till end of the page.
	
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	
	System.out.println(js.executeScript("return window.pageYOffset;"));
		
		System.out.println("**** Execution Over ****************");
		
		
		// Now scroll back to the top of the page
		
		
		Thread.sleep(3000);
		
js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	}

}
