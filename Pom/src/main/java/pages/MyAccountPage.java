package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyAccountPage extends BaseClass{
	
	public CreateAccountPage clickCreateLeads() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateAccountPage();
	}

}
