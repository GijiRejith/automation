package basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in/");
	       System.out.println(driver.getTitle());
	       System.out.println( driver.getCurrentUrl());
	        driver.navigate().to("https://www.google.com/");
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.navigate().forward();
	        driver.quit();
	        driver.navigate().refresh();

	}

}
