package week3.day1;

public class Chrome extends Browser{

	private void openIncognito() {
	
System.out.println("Incognito opened");
	}
	private void clearCache() {
	System.out.println("Cache cleared");
	}
	
public static void main(String[] args) {
	Chrome s1 = new Chrome();
	s1.openURL();
	s1.navigateBack();
	s1.closeBrowser();
	s1.openIncognito();
	s1.clearCache();
}

 

}