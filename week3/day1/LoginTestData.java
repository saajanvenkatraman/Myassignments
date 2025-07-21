package week3.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("UserName: John Doe");
	}
public void enterPassword() {
	System.out.println("Password: Abc@123");

}
public static void main(String[] args) {
	LoginTestData body = new LoginTestData ();
	body.enterUsername();
	body.enterPassword();
	body.enterCredentials();
	body.navigateToHomePage();
}
}
