package week3.day1;

public class WebElement {
	
	public void click() {
		System.out.println("Click Facebook");

	}
public void setText() {
	System.out.println("Hello World");


}
public static void main(String[] args) {
	WebElement body1 = new WebElement();
	body1.click();
	body1.setText();
}
}
