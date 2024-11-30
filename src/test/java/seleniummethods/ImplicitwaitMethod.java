package seleniummethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	//driver.findElement(By.id("btn1")).click();
	
//	WebElement status=driver.findElement(By.xpath("//input[@id='txt1']"));
//	status.sendKeys("varma");
//	System.out.println(status.isDisplayed());
	
	driver.findElement(By.id("btn2")).click();
	WebElement status2=driver.findElement(By.xpath("//input[@id='txt2']"));
	System.out.println(status2.isDisplayed());
	status2.sendKeys("kumar varma");
	
}
}
