package basic;




import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handling {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	
	
	
	String main = driver.getWindowHandle();
	System.out.println(main);
	
	 driver.findElement(By.id("windowButton")).click();

	Set<String> child=driver.getWindowHandles();
	System.out.println(child);
	Iterator<String> it = child.iterator(); 
	String m = it.next();
	String s = it.next();
	driver.switchTo().window(s);
	String message = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(message);
	
	driver.quit();
	
}

}
