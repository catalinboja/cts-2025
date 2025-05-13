package ro.ase.csie.cts.patterns.strategy;

public class PaymentModule {
	
	String processorName;
	
	IPaymentService paymentService;
	
	public void setPaymentService(IPaymentService service) {
		this.paymentService = service;
	}
	
	public void pay(double amount) {
		//System.out.println("Pay by card: " + amount);
		if(this.paymentService != null) {
			//callback
			this.paymentService.pay(amount);
		}
	}

}
