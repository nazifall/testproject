package mypl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());
		
	}

}
