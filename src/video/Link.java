package video;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;


public class Link {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  //Maximizes the browser window
		  driver.manage().window().maximize() ;
		  driver.get("https://bongobd.com/watch/8NW6fpYBsCY");
		  Thread.sleep(50000); //it will wait 50 seconds because maximum ad limit is 20 seconds
		  driver.findElement(By.xpath("//*[@id=\"vid1\"]/div[4]/button[1]")).click(); //play button xpath
          
	}
}
