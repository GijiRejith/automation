package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelement {
public static  void main(String args[]) {
        WebDriverManager.edgedriver().setup();
        WebDriver web=new ChromeDriver();
        web.get("https://www.facebook.com/");
        
     //   web.findElement(By.cssSelector("#email")).sendKeys("gggg");
        web.findElement(By.cssSelector("input#email[name = 'email']")).sendKeys("gggg");
        
        
}
}
