package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseaction {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement dc =driver.findElement(By.id("doubleClickBtn"));
		WebElement rc =driver.findElement(By.id("rightClickBtn"));
		WebElement cc =driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		action.doubleClick(dc).perform();
		Thread.sleep(2000);
		action.contextClick(rc).perform();
		Thread.sleep(2000);
		action.click(cc).perform();
		Thread.sleep(2000);
		
	}

}
