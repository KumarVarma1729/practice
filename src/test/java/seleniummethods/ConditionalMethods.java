package seleniummethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://testautomationpractice.blogspot.com/");
	 
	
	WebElement title=driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
	
	WebElement maleradiobutton=driver.findElement(By.id("male"));
	
	System.out.println("Title status:"+title.isDisplayed());
	System.out.println("visibility of radio Button:"+maleradiobutton.isDisplayed());
	System.out.println("enable of maleradiobutton:"+maleradiobutton.isEnabled());
	System.out.println("selection of radiobutton:"+maleradiobutton.isSelected());
	maleradiobutton.click();
	System.out.println("After  selection of radiobutton:"+maleradiobutton.isEnabled());
	System.out.println("");
}
}
