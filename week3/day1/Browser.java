package week3.day1;

public class Browser {
	
	String browserName = "Chrome";
	String browserVersion= "32.12.01";
	
	public void openURL() {
	System.out.println("Facebook opened");

	}
	public void closeBrowser() {
	System.out.println("Chrome Closed");

	}
		public void navigateBack() {
			System.out.println("Navigation completed");
		}
public static void main(String[] args) {
	Browser body = new Browser();
	body.openURL();
	body.closeBrowser();
	body.navigateBack();
}
}
