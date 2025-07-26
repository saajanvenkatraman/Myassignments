package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {
	public static void main(String[] args) {
		
	
	// launch browser
	ChromeDriver driver = new ChromeDriver();
	
	// launch URL
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");	
	
	//Maximize browser

	driver.manage().window().maximize();
	
	// transfer to frame
	
	driver.switchTo().frame("iframeResult");
	// select Try button
	
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	// switching to alert
	
	Alert alert = driver.switchTo().alert();
	
	//adding input to the alert
	
	alert.sendKeys("Shay Plays Gaming");
	
	//accept the alert
	
	alert.accept();
	
	//getting the text 
	
	String text = driver.findElement(By.id("demo")).getText();
	
	System.out.println(text);
	
	//close the browser
	
	driver.close();
		
	}
	}

