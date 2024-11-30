package seleniummethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		String currentUrl=driver.getCurrentUrl();
		System.out.println("CuurntUrl:"+currentUrl);
		String pageSource=driver.getPageSource();
		System.out.println("PAgeSource:"+pageSource);
		String title=driver.getTitle();
		System.out.println("Title:"+title);
		String windowid=driver.getWindowHandle();
		System.out.println("Windowid:"+windowid);
		WebElement newwindow=driver.findElement(By.xpath("//button[text()='New Browser Window']"));
		 newwindow.click();
		 Set<String> windowids=driver.getWindowHandles();
		List<String> getwindowhandles=new ArrayList(windowids);
		String parentwindow=getwindowhandles.get(0);
		String childwindow=getwindowhandles.get(1);
		System.out.println("ParentWindowid:"+parentwindow);
		System.out.println("ChildWindowid:"+childwindow);
		
	}
	
}
