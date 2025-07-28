package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WH {
	public static void main(String[] args) {
		ChromeOptions done= new ChromeOptions();
		done.addArguments("guest");
		//launch browser
		ChromeDriver driver = new ChromeDriver(done);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//max windows
		driver.manage().window().maximize();
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//select the CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//select the contacts tab
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//select merge contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//select from contact widget
		driver.findElement(By.xpath("//a[contains(@href,'partyIdFrom')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		//Handling windows
	Set<String> windowHandles = driver.getWindowHandles();	
	//Converting set into list for getting the index of the window address
	
	List<String>winz=new ArrayList <String>(windowHandles);
	
	String parent = winz.get(0);
		String child = winz.get(1);
		// going to the child window
		
		driver.switchTo().window(child);
		
		//select first contact
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]")).click();
		
		driver.switchTo().window(parent);
		
		//selecting to contact widget
		driver.findElement(By.xpath("//a[contains(@href,'partyIdTo')]")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		List <String> winz2 = new ArrayList <String> (windowHandles2);
		
		String parent1 = winz2.get(0);
		String child1 = winz2.get(1);
		
		driver.switchTo().window(child1);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]")).click();
		// clicking the second contact
		driver.switchTo().window(parent1);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.getTitle());
		
				
		
	}

}
