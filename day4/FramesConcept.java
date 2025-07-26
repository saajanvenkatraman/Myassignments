package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {
	public static void main(String[] args) {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
 //Load the target URL
		driver.get("https://leafground.com/frame.xhtml");
		//max windows
		driver.manage().window().maximize();
		//outer frame
		driver.switchTo().frame(2);
		//inner Frame
		WebElement innerFrame = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(innerFrame);
	// clicking the button
		driver.findElement(By.id("Click")).click();
		
		driver.close();	
	}

}
