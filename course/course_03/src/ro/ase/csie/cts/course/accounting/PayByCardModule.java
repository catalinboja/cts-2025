package ro.ase.csie.cts.course.accounting;

public class PayByCardModule implements IAccounting{

	@Override
	public void payTuition(double amount) {
		System.out.println("Pay by card");
	}

}
