package video;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Link {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		
		  driver.manage().window().maximize();
		  driver.get("https://bongobd.com/watch/8NW6fpYBsCY");
		  Actions action = new Actions(driver);
		  WebElement elm = driver.findElement(By.xpath("//button[@class='vjs-big-play-button']/span[@class='vjs-icon-placeholder' and 1]"));
		  action.click(elm).perform();
      
          
	}
}

