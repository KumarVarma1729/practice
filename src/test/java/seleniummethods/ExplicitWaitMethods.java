package seleniummethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitMethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	
    driver.findElement(By.id("btn1")).click();
    driver.findElement(By.id("btn2")).click();

	//WebElement status=driver.findElement(By.xpath("//input[@id='txt1']"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement status=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt1']")));

	status.sendKeys("varma");
	//System.out.println(status.isDisplayed());
	WebElement status2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt2']")));

	status2.sendKeys("kumarvarma");
	
	
}
}
