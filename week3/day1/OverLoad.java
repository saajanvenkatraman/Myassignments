package week3.day1;

public class OverLoad {
	
	public void reportStep(String msg,String status) {
	 System.out.println(msg+" "+status);
	}
public void reportStep(String msg,String status,boolean snap) {
	
	System.out.println(msg +" "+status+snap);

}
public static void main(String[] args) {
	OverLoad body = new OverLoad();
	body.reportStep("Hello", "message sent");
	body.reportStep("World", "photo not taken ", false);
}
}
