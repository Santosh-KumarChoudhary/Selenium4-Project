package lenskart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviePhase {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.lenskart.com/");
		
		// First select Eye glasses -> Full Rim
		//Click on drop down item and select Biggest Saving
		// Now get the price of the first 15 elements
		
		driver.findElement(By.xpath("//img[@class='mainicon' and @src='https://static1.lenskart.com/media/desktop/img/Apr22/a2.png']")).click();
		
		driver.findElement(By.xpath("//span[@class='ImageText--9yhcif bcLkvf' and text()='Full Rim']")).click();
		
		WebElement drop=driver.findElement(By.xpath("//select[@class='SelectBox--j2i0rr ijLlpt']"));
		
	Select sc= new Select(drop);
	
	sc.selectByVisibleText("Biggest Savings");
	
String prodPrice=	driver.findElement(By.xpath("//div[@class='OfferPrice--169iodc kPAsSR' and text()='1200']")).getText();

System.out.println(prodPrice);
		
		
	}

}
