package Selenium4Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsSlider {
	
	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  
		  
		  Actions act = new Actions(driver);
		  
		  //Min Slider
		  
		  	
		  driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		  
	WebElement min_slider=	  driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"][1]"));
		  
		  
Point loc=	min_slider.getLocation();

System.out.println("Location of the starting slider is "+loc);
//Location of the starting slider is (68, 293)
act.dragAndDropBy(min_slider, 50, 293).perform();

System.out.println("New Location "+min_slider.getLocation());


System.out.println("**********Execution Over***************");





// Max Slider
Thread.sleep(2000);

WebElement max_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));

		  
Point loc2=max_slider.getLocation();

System.out.println("max_slider location "+loc2);

act.dragAndDropBy(max_slider, -179, 289).perform();

System.out.println(max_slider.getLocation());

System.out.println("Slided backward");


		  
		  
	}

}
