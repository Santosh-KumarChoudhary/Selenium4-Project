package Selenium4.SelNium4Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignments {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
	WebElement select=	driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select sc= new Select(select);
		
		sc.selectByVisibleText("Paris");
		
		System.out.println("Flying from paris ");
		
	WebElement destination=	driver.findElement(By.xpath("//select[@name='toPort']"));
	
	Select sc1= new Select(destination);
	
	sc1.selectByVisibleText("London");
	System.out.println("Going to London ");
	
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	System.out.println("Click on find flight");
	
	Thread.sleep(3000);
	
int row=	driver.findElements(By.xpath("//table[@class='table']//th")).size();

System.out.println("row : "+row);

int column=driver.findElements(By.xpath("//table[@class='table']//th")).size();

System.out.println("column :"+column);


//getting all elements of table

//for(int i=2;i<	row;i++)
//{
//	for(int j=1;j<column;j++)
//		
//	{
//	String allElements=	driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td["+j+"]")).getText();
//	
//	System.out.println(" "+allElements);
//	}
//}

	
	// Now get all the prices only

double lowestPrice = Double.MAX_VALUE;


for(int i=1;i<row;i++)
	
{
	String prices=driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[6]")).getText().replace("$", "");
	


Double finPrice=Double.valueOf(prices);


if(finPrice<lowestPrice)
{
	lowestPrice=finPrice;
}


	
	System.out.println("Prices "+finPrice);
	
	
}
System.out.println("lowestPrice "+lowestPrice);

	
	System.out.println("************OVER***************");
	
	driver.close();
		
		
		
		
		
		
	}

}
