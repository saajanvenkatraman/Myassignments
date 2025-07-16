package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookHome {

	public static void main(String[] args) {
		
		
		ChromeDriver body = new ChromeDriver();
		
		body.get("https://en-gb.facebook.com/");
		body.manage().window().maximize();
		
		body.findElement(By.linkText("Create new account")).click();
		body.findElement(By.name("firstname")).sendKeys("John");
		body.findElement(By.name("lastname")).sendKeys("Doe");
		body.findElement(By.name("reg_email__")).sendKeys("Johndoe12@gmail.com");
		body.findElement(By.id("password_step_input")).sendKeys("Abc@123");
		
		WebElement element = body.findElement(By.id("day"));
		
		Select options = new Select(element);
		
		options.selectByIndex(2);
		
		WebElement element2 = body.findElement(By.id("month"));
		
		Select options1 = new Select(element2);
		
		options1.selectByVisibleText("May");
		
		WebElement element3 = body.findElement(By.id("year"));
		Select options2 = new Select(element3);
		
		options2.selectByValue("1997");
		
	  WebElement element4 = body.findElement(By.xpath("//input[@type='radio' and @value='2']"));
	  element4.click();
	  
			
		
		
	
		

	}
}
