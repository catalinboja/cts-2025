package ro.ase.csie.cts.laboratory.stage2;

public class ProductDiscount {
	
	public static final int ACCOUNT_AGE_LIMIT_DISCOUNT = 10;
	public static final float MAX_ACCOUNT_DISCOUNT_VALUE = 0.15f;

	
	public float getFinalPrice(
			ProductType productType, 
			float initialPrice, 
			int userAccountAge)
	  {
	    float finalPrice = 0;
	    float accountDiscount = 
	    		(userAccountAge > ACCOUNT_AGE_LIMIT_DISCOUNT) ? MAX_ACCOUNT_DISCOUNT_VALUE : (float)userAccountAge/100; 
	    
	    switch(productType) {
	    case NEW:
	    	{
	    		finalPrice = initialPrice;
	    		break;
	    	}
	    case SILVER: {
	    		finalPrice = (initialPrice - (productType.getDiscount() * initialPrice)) - accountDiscount * (initialPrice - (productType.getDiscount() * initialPrice));
	    		break;
	    }
	    case GOLD: {
	    		finalPrice = (initialPrice - (productType.getDiscount() * initialPrice)) - accountDiscount * (initialPrice - (productType.getDiscount() * initialPrice));
	    		break;
	    	}
	    case PLATINUM:
	    	{
	    		finalPrice = (initialPrice - (productType.getDiscount() * initialPrice)) - accountDiscount * (initialPrice - (productType.getDiscount() * initialPrice));
	    		break;
	    	}
	    default:
	    	throw new UnsupportedOperationException();
	    }
	    
	    return finalPrice;
	  }
}
