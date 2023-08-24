package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerttt {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
	WebElement Simple=driver.findElement(By.id("alertbutton"));
	WebElement Confirm=driver.findElement(By.id("confirmButton"));
	WebElement Prompt=driver.findElement(By.id("promtButton"));
	
	Simple.click();
	driver.switchTo().alert().accept();

	Alert alert = driver.switchTo().alert();
	alert.accept();
	}

}
