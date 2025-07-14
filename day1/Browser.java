package week2.day1;

public class Browser {

	public String launchBrowser(String browserName) {
		System.out.println("browser launched successfully");
		return browserName;
		
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser object = new Browser();
		String v  = object.launchBrowser("chrome");
		System.out.println(v);
		object.loadUrl();
		
		
	}
}
