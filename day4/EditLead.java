package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
		ChromeOptions done= new ChromeOptions();
		done.addArguments("guest");
		
		ChromeDriver body = new ChromeDriver(done);
		
		body.get("http://leaftaps.com/opentaps/");
		
		body.manage().window().maximize();
		
		body.findElement(By.id("username")).sendKeys("DemoSalesManager");
		body.findElement(By.id("password")).sendKeys("crmsfa");
		body.findElement(By.className("decorativeSubmit")).click();
		body.findElement(By.linkText("CRM/SFA")).click();
		body.findElement(By.linkText("Leads")).click();
		body.findElement(By.linkText("Create Lead")).click();
		body.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Shay plays Enterprise");
		body.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Magnus");
		body.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Carlsen");
		body.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Edison");
		body.findElement(By.id("createLeadForm_departmentName")).sendKeys("Department of Civil");
		body.findElement(By.id("createLeadForm_description")).sendKeys("COD MW 2");
		body.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("sadrider17@gmail.com");
		
		WebElement element1 = body.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select options = new Select(element1);
		options.selectByContainsVisibleText("New York");
		 	
		body.findElement(By.className("smallSubmit")).click();
		body.findElement(By.xpath("//a[text()='Edit']")).click();
		body.findElement(By.id("updateLeadForm_description")).clear();
		body.findElement(By.id("updateLeadForm_importantNote")).sendKeys("I am a tester");
		body.findElement(By.name("submitButton")).click();
		String title = body.getTitle();
		System.out.println(title);
		
		body.close();
	
		
		
	}

}
