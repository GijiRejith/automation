package basic;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
		   
		   driver.findElement(By.name("q")).sendKeys("jav");
		 driver.findElement(By.cssSelector("body[jsmodel='hspDDf']")).click();
		   Thread.sleep(2000);
		//  driver.findElement(By.className("srp")).click();
		//  JavascriptExecutor js = (JavascriptExecutor) driver;
		//	js.executeScript("window.scrollBy(0,250)", "");
	}

}
