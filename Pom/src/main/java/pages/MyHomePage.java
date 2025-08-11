package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyAccountPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
return new MyAccountPage();
	}

}
