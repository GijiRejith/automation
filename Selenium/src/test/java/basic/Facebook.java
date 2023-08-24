package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	WebDriver web=new ChromeDriver();
	web.get("https://www.facebook.com/");
	web.manage().window().maximize();
	WebElement textbox =web.findElement(By.id("email"));
	textbox.sendKeys("gij");
	WebElement password=web.findElement(By.id("pass"));
	password.sendKeys("hkjkkjk");
	WebElement button=web.findElement(By.name("login"));
	button.click();
	WebElement text=web.findElement(By.className("_9ay7"));
	System.out.println(text.getText());
	
}
}
