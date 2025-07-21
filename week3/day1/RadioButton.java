package week3.day1;

public class RadioButton extends Button {
public void selectRadioButton() {
	System.out.println("Male Radio button selected");
}
public static void main(String[] args) {
	RadioButton b4 = new RadioButton();
	
	b4.submit();
	b4.selectRadioButton();
	
}
}
