package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_menu {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver web=new ChromeDriver();
		web.get("https://demoqa.com/select-menu");
		web.manage().window().maximize();
	
		WebElement Selectt=web.findElement(By.className("css-1hwfws3"));
    	Selectt.click();
     
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);

	 WebElement Select1=web.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]"));
     	Select1.click();
     	 Robot c= new Robot();
         c.keyPress(KeyEvent.VK_DOWN);
     	c.keyPress(KeyEvent.VK_DOWN);
     	c.keyPress(KeyEvent.VK_ENTER);
     	
     	WebElement Outside=web.findElement(By.className("body-height"));
     	Outside.click();
     	
     	 WebElement Select2=web.findElement(By.id("oldSelectMenu)"));
     //	Select2.click();
      Select d=new Select(Select2);
      d.selectByValue("1");
      
      
	}

}
