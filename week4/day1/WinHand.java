package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHand {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("(//li[@class='menu-list header-icon-menu'])[3]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		//transform set to list
		List <String> handle = new ArrayList <String> (windowHandles);
		String parent = handle.get(0);
		String child = handle.get(1);
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		driver.close();
	}

}
