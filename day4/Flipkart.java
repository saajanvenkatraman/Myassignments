package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		
		ChromeDriver body = new ChromeDriver();
		
		body.get("https://www.flipkart.com/");
		body.manage().window().maximize();
		
		body.findElement(By.xpath("//input[@name='q']")).sendKeys("Men's Shirt");
	
		
	}

}
