package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_form {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver web=new ChromeDriver();
		web.get("https://demoqa.com/automation-practice-form");
		web.manage().window().maximize();
		WebElement firstname =web.findElement(By.id("firstName"));
		firstname.sendKeys("giji");
		WebElement lastname=web.findElement(By.id("lastName"));
		lastname.sendKeys("g");
		WebElement email=web.findElement(By.id("userEmail"));
		email.sendKeys("jkjjj@gmail.com");
		web.findElement(By.cssSelector("label[for='gender-radio-2']")).click();
    	WebElement phone=web.findElement(By.cssSelector("input[id='userNumber']"));
	    phone.sendKeys("8966665221");
//date of birth
	    
	web.findElement(By.id("dateOfBirthInput")).click();
	//month
	WebElement month=web.findElement(By.cssSelector(".react-datepicker__month-select"));
	Select d=new Select(month);
	d.selectByValue("8");
	//year
     WebElement year=web.findElement(By.cssSelector(".react-datepicker__year-select"));
     Select s=new Select(year);
	s.selectByValue("2025");
	
	//date
	WebElement date=web.findElement(By.cssSelector("div[aria-label='Choose Tuesday, September 2nd, 2025']"));
	
	date.click();
	Thread.sleep(3000);

	JavascriptExecutor js = (JavascriptExecutor) web;
	js.executeScript("window.scrollBy(0,250)", "");
	
	  WebElement sub=web.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
     sub.click();
   //  sub.
    
	web.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();

	
		
		
	}

}
