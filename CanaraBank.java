package week2.day4;

public abstract class CanaraBank implements Payments {

	@Override
	public void cashOnDelivery() {
		System.out.println("Make a cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payments are good");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments are little tedious");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking are always a very good option");
		
	}
	public abstract void recordPaymentDetails();
public static void main(String[] args) {
	
}
}
