package ro.ase.csie.cts.patterns.strategy;

public class PaypalPaymentService implements IPaymentService{
	
	String username;
	
	public PaypalPaymentService(String username) {
		super();
		this.username = username;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Pay by PayPal: " + amount);
	}

}
