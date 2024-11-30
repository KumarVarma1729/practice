package seleniummethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
 
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement newwindow=driver.findElement(By.xpath("//button[text()='New Browser Window']"));
		 newwindow.click();
		// driver.close();
		 driver.findElement(By.id("name")).sendKeys("varma");
		 driver.quit();

}
}
