package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadAssignment {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
driver.manage().window().maximize();

driver.findElement(By.id("email")).sendKeys("johnDoe@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Allow123@z");
driver.findElement(By.name("login")).click();
	}

}
