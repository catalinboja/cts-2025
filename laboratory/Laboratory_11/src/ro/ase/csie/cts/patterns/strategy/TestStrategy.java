package ro.ase.csie.cts.patterns.strategy;

public class TestStrategy {

	public static void main(String[] args) {

		PaymentModule paymentModule = new PaymentModule();
		paymentModule.setPaymentService(new CardPaymentService("VISA"));
		
		paymentModule.pay(123);
		
		paymentModule.setPaymentService(new PaypalPaymentService("admin"));
		paymentModule.pay(123);
	}

}
