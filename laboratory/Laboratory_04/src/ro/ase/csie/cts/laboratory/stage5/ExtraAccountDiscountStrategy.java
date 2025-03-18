package ro.ase.csie.cts.laboratory.stage5;

public class ExtraAccountDiscountStrategy implements IMarketingStrategy{
	
	public static final int ACCOUNT_AGE_LIMIT_DISCOUNT = 10;
	public static final float MAX_ACCOUNT_DISCOUNT_VALUE = 0.15f;
	
	private int accountAgeInYears;
	

	public ExtraAccountDiscountStrategy(int accountAgeInYears) {
		super();
		this.accountAgeInYears = accountAgeInYears;
	}

	@Override
	public float getExtraDiscount() {
	    float accountDiscount = 
	    		(this.accountAgeInYears > ACCOUNT_AGE_LIMIT_DISCOUNT) ? 
	    				MAX_ACCOUNT_DISCOUNT_VALUE : (float)accountAgeInYears/100; 
	    return accountDiscount;
	}
	
	
}
