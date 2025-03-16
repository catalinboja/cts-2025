package ro.ase.csie.cts.course.accounting;

public class PayByCryptoModule implements IAccounting{

	@Override
	public void payTuition(double amount) {
		System.out.println("Pay with bitcoin");
	}

}
