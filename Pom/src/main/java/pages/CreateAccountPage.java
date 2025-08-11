package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateAccountPage extends BaseClass {
	public CreateAccountPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Rockstar Studios");
return this;
	}
	public CreateAccountPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kurt");
return this;
	}
   public CreateAccountPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Cobain");
return this;
	}
  public ViewAccountPage clickCreateLead() {
	driver.findElement(By.name("submitButton")).click();
return new ViewAccountPage();
}

}
