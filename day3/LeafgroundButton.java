package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {
	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver body = new ChromeDriver();
 //Load the target URL
		body.get("https://leafground.com/button.xhtml");
		//max windows
		body.manage().window().maximize();
		
		//click on the button with the text 'Click and Confirm title
		
		body.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		
		Thread.sleep(3000);
		String expectedTitle="Dashboard";
		String actualTitle= body.getTitle();
		System.out.println(actualTitle);
		
		// Verify that the title of the page is Dashboard
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Page title is correct: "+actualTitle);
		}
		else {
			System.out.println("Page title is not correct");
		}
		Thread.sleep(3000);
		 // Navigate back to the previous page	
		body.navigate().back();
		// // Check if the button with the text 'Confirm if the button is disabled' is disabled
		boolean ena = body.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		System.out.println("Is it enabled :"+ena);
		// // Find and print the position of the button with the text 'Submit.'
		Point location = body.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("Button Position :"+location);
		// Find and print the background color of the button with the text 'Find the Save button color.
		String csgo = body.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).getCssValue("background-color");
		System.out.println("Button Color :"+csgo);
		//find size (Height and width)
		Dimension size = body.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize();
		
		System.out.println("Height:" +size.height +" "+ "Width :"+size.width);
		//close browser
		body.close();
	}


}
