package basic;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_handling {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
		   
		   driver.findElement(By.name("q")).sendKeys("java");
		   Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_T);
		   
		
	}
	
}
