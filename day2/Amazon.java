package week3.day2;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		System.out.println("Payment Method : Cash on Delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Payment Method : UPI");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Payment Method : Credit/Debit Card");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Payment Method: Internet Banking");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Payment Details Recorded");
		
	}
	public static void main(String[] args) {
		Amazon body = new Amazon();
		body.cashOnDelivery();
		body.upiPayments();
		body.cardPayments();
		body.internetBanking();
		body.recordPaymentDetails();
	}
	

}
