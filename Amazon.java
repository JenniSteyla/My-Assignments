package week2.day4;

public class Amazon extends CanaraBank {

	@Override
	public void recordPaymentDetails() {
		System.out.println("We should record the payment details");
		
	}
	public static void main(String[] args) {
		Amazon pay = new Amazon();
		pay.cardPayments();
		pay.cashOnDelivery();
		pay.internetBanking();
		pay.recordPaymentDetails();
		pay.upiPayments();
	}

}
