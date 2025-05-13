package ro.ase.csie.cts.patterns.strategy;

public class CardPaymentService implements IPaymentService{

	String cardProcessor;
	
	public CardPaymentService(String cardProcessor) {
		super();
		this.cardProcessor = cardProcessor;
	}

	@Override
	public void pay(double amount) {

		System.out.println("Pay by card: " + amount);
	}

}
