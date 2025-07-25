package week3.marathon;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch browser
		driver.get("https://www.pvrcinemas.com/");
		//maximize windows
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[1]")).click();

		driver.findElement(By.xpath("//body[@class='pvrTheme sweetalert-overflow-hidden p-overflow-hidden']")).click();
		driver.findElement(By.xpath("//span[@class='sc-jBIHhB kxYKRY']")).click();
		//click cinema button
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//selecting the cinema theater
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']")).click();
		// select the date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
		//select the movie
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		//select the timing
		Thread.sleep(3000);
       // driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
        
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
        // press the book button
        
        
        driver.findElement(By.xpath("//button[@class='p-button p-component sc-gNZgCX hrwxnG bgColor filter-btn']")).click();
        //accept terms and conditions
        
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        
        // select the seat
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//span[@id='SL.SILVER|D:15']")).click();
        
        //proceed
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        
        //print seat 
        
        String text = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
        System.out.println("The seat information :"+ text);
        
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println("The Grand total is:" + grandTotal);
		
		//click proceed
		driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
	
		//close the popup
		
		driver.findElement(By.xpath("//i[@class='pi pi-times']")).click();
		Alert alert1 = driver.switchTo().alert();
		
		alert1.dismiss();
		
		
		String title = driver.getTitle();
		
		System.out.println("Title of the Page :"+title);
		
		//close the browser
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
