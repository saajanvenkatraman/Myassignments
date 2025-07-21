package week3.day1;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("Check button clicked");

	}
public static void main(String[] args) {
	
	CheckBoxButton b3 = new CheckBoxButton();
	
	b3.submit();
	b3.clickCheckButton();
}
}
