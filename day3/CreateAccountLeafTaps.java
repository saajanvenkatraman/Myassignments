package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccountLeafTaps {

	public static void main(String[] args) {
		ChromeOptions done= new ChromeOptions();
		done.addArguments("guest");
		ChromeDriver body = new ChromeDriver(done);
		
		body.get("http://leaftaps.com/opentaps/");
		body.manage().window().maximize();
		
		body.findElement(By.id("username")).sendKeys("Demosalesmanager");
		body.findElement(By.id("password")).sendKeys("crmsfa");
		body.findElement(By.className("decorativeSubmit")).click();
		body.findElement(By.linkText("CRM/SFA")).click();
		body.findElement(By.linkText("Accounts")).click();
		body.findElement(By.linkText("Create Account")).click();
		body.findElement(By.id("accountName")).sendKeys("2015280901");
		body.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		body.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		body.findElement(By.id("numberEmployees")).sendKeys("380");
		body.findElement(By.className("smallSubmit")).click();
		
		body.close();
		;
		}
}
