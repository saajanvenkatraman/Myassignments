package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
	public static void main(String[] args) {
		ChromeOptions done= new ChromeOptions();
		done.addArguments("guest");
			ChromeDriver body = new ChromeDriver(done);
			
			body.get("http://leaftaps.com/opentaps/." );
			body.manage().window().maximize();
			body.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			body.findElement(By.id("username")).sendKeys("DemoSalesManager");
			body.findElement(By.id("password")).sendKeys("crmsfa");
			body.findElement(By.className("decorativeSubmit")).click();
			body.findElement(By.linkText("CRM/SFA")).click();
			body.findElement(By.xpath("//a[text()='Leads']")).click();
			body.findElement(By.xpath("//a[text()='Find Leads']")).click();
			body.findElement(By.xpath("//span[text()='Phone']")).click();
			body.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8508821842");
			body.findElement(By.linkText("Find Leads")).click();
			
			WebElement element = body.findElement(By.xpath("//a[text()='10115']"));
			String s1 = element.getText();
			System.out.println("capture ID: "+s1);
			element.click();
			
			
			body.findElement(By.linkText("Delete")).click();
			body.findElement(By.linkText("Find Leads")).click();
			body.findElement(By.xpath("//input[@id='ext-gen253']")).sendKeys(s1);
			body.findElement(By.name("id")).click();

			
			
			body.close();
			
			
	}
			

}
