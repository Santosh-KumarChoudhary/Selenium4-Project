package Selenium4Classes;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksIdentifier {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.deadlinkcity.com/");

		// Capture all the links ny using tag name
		
		int brokenLinksCount=0;

		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));

		try {

			for (WebElement links : Alllinks)

			{

				// get only url from the tags and check whether it's empty or not , if so skip
				// the link
				// and continue
				String url = links.getAttribute("href");

				if (url == null || url.isEmpty())

				{
					System.out.println("LInk is empty");
					continue;
				}

				// Convert href value from String to the URL

				URL urlLink = new URL(url);

				// Now establish the connection to the server to hit the URL

				HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();

				// connect the server and send request

				connection.connect();
				
				// If status code is>= 400 , it means links are broken

				if (connection.getResponseCode() >= 400)

				{
					System.out.println("Links are broken >>>>>> " + url);
					
					brokenLinksCount++;
				} else {
					System.out.println("Not a broken URL " + url);
				}

				//System.out.println("URLS are " + url);
				
				
				

			}
			
			
		} catch (Exception e)

		{

		}
		
		System.out.println("Count of broken links are "+brokenLinksCount);


	}

}
