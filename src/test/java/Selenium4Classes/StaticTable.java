package Selenium4Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//capture number of rows in a column
		
	int row=	driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	
	System.out.println("Row count : "+row);
	
//int totalLinks=	driver.findElements(By.tagName("//a")).size();
//System.out.println("Total LInks are "+totalLinks);
	
	
	//capture headers or number of columns
	
int columns=	driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();

System.out.println(" columns count : "+columns);
	// Read data from specific row and column


//capture 5th row first colum data

String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();

System.out.println("bookName "+bookName);

// Now printing all the table's data

System.out.println("BookName	"+"      Author "+"     Subject "+"     Price ");

for(int i=2;i<=row;i++)
	
{
	for(int j=1;j<=columns;j++)
		
	{
	
		
		String bookName1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
		
		
		System.out.print(bookName1+"\t");
	}
	System.out.println();
}
	
	// Now printAuthor name Mukesh and it's Nook name



//first get the author name
//
//for(int a=2;a<=row;a++)
//	
//{
//	String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ a+"]//td[2]")).getText();
//	
//	System.out.println("author :"+author);
//	
//	if(author.equals("Mukesh"))
//		
//	{
//		String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ a+"]//td[1]")).getText();
//		
//		System.out.println(author + " and it's book "+BookName );
//
//	}
	
	//Now find the price of all the books
//	int totalPrice=0;
//	
//	for(int i=2;i<=row;i++)
//		
//	{
//		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
//		
//		totalPrice=totalPrice+Integer.valueOf(value);
//	}
//	System.out.println("Total Price is "+totalPrice);


	driver.close();
				
		
	

}}
