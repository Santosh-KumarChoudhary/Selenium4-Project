package flipkart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class End2EndAutomation {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		
		

		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("15 pro max");

		search.submit();

		// String
		// price=driver.findElement(By.xpath("//a[@class='VJA3rP']//div[@class='hl05eU']")).getText();

		// System.out.println(price);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='zg-M3Z' and text()='Price -- High to Low']")).click();
		System.out.println(" high to low filter applied");

		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(ele.size());

		WebElement least_Value = ele.get(0);

		int least = Integer.parseInt(least_Value.getText().replace("₹", "").replace(",", ""));

		WebElement least_price_el = null;

		if (ele.size() > 0)

		{

			for (WebElement el : ele)

			{

				String data = el.getText();

				int value = Integer.parseInt(data.replace("₹", "").replace(",", ""));

				if (value < least) {
					least = value;
					least_price_el = el;
				}

			}

			if (least_price_el != null)

			{

				least_price_el.click();

			}

		}
		System.out.println("least value " + least);
		

		
		List<String> window= new ArrayList<String>(driver.getWindowHandles());
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Size "+window.size());
		
		driver.switchTo().window(window.get(1));
		
		
				
				//driver.switchTo().window(windo)	;
				
				System.out.println( driver.getTitle());
			String tex=	driver.findElement(By.xpath("//button[text()='NOTIFY ME']")).getText();
			
			Assert.assertEquals(tex, "NOTIFY ME" ," NO MATCH!!!!!");
			
			System.out.println("Product availability "+tex);
			
			
			System.out.println("**********Execution Over ****************");
				}
			
		
				
				

	}


