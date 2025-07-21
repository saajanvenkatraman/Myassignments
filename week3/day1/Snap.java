package week3.day1;

public class Snap extends OverLoad {

	public void takeSnap() {
	System.out.println("Snap taken");
	}
	public void reportStep(String msg,String status) {
		super.reportStep("Hello", "sent");
		System.out.println("ARGS");
	
		
	}
	public static void main(String[] args) {
		Snap body = new Snap();
		body.takeSnap();
		body.reportStep("free", "sent");
	}
}
