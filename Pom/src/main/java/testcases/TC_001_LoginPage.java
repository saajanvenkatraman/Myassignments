package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_LoginPage extends BaseClass{
	@Test
	public void createLead() {
		LoginPage log = new LoginPage();
		log.userName()
		.password()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeads()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName();
		
		
		

	}

}
