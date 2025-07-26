package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConformAlert {
	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver body = new ChromeDriver();
 //Load the target URL
		body.get("https://www.leafground.com/alert.xhtml");
		//max windows
		body.manage().window().maximize();
		
		//find and click the webelement
		
		body.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//tansfer to alert
		Alert alert1 = body.switchTo().alert();
		// getting the alert text
		String text = alert1.getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		//accepting the conform alert
		alert1.accept();
		
		body.close();
		
		
		
	}

}
