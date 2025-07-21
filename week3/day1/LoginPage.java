package week3.day1;

public class LoginPage extends BasePage{
	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("Select Find People");
		
		

	}
	public static void main(String[] args) {
		LoginPage body = new LoginPage();
		body.performCommonTasks();
		body.findElement();
		body.clickElement();
		body.enterText();
	}
}
