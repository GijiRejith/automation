package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_commands {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement textbox =driver.findElement(By.id("email"));
		textbox.sendKeys("gij");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("hkjkkjk");
		WebElement button=driver.findElement(By.name("login"));
		

		
		String str=button.getTagName();
		System.out.println(str);
		
		String text=button.getText();
		System.out.println(text);
		
		String ss=button.getCssValue(text);
		System.out.println(ss);
		
		button.click();
		
	}

}
