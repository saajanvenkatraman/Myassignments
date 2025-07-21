package week3.day1;

public class Button extends WebElement {
public void submit() {
	System.out.println("Submit the report");
}
public static void main(String[] args) {
	Button b = new Button();
	b.click();
	b.setText();
	b.submit();
}
}
