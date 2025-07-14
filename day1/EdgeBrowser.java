package week2.day1;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser object = new Browser();
		String launch1 = object.launchBrowser("Edge");
	System.out.println(launch1);
		object.loadUrl();
	}
	

}
