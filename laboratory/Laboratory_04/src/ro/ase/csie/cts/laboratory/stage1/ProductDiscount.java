package ro.ase.csie.cts.laboratory.stage1;

public class ProductDiscount {
	
	public static final int ACCOUNT_AGE_LIMIT_DISCOUNT = 10;
	public static final float MAX_ACCOUNT_DISCOUNT_VALUE = 0.15f;
	public static final int NEW_PRODUCT = 1;
	public static final int SILVER_PRODUCT = 2;
	public static final float SILVER_PRODUCT_DISCOUNT_VALUE = 0.1f;
	public static final int GOLD_PRODUCT = 3;
	public static final float GOLD_PRODUCT_DISCOUNT_VALUE = 0.25f;
	public static final int PLATINUM_PRODUCT = 4;
	public static final float PLATINUM_PRODUCT_DISCOUNT_VALUE = 0.35f;
	
	
	public float getFinalPrice(
			int productType, 
			float initialPrice, 
			int userAccountAge)
	  {
	    float finalPrice = 0;
	    float accountDiscount = 
	    		(userAccountAge > ACCOUNT_AGE_LIMIT_DISCOUNT) ? MAX_ACCOUNT_DISCOUNT_VALUE : (float)userAccountAge/100; 
	    if (productType == NEW_PRODUCT)
	    {
	      finalPrice = initialPrice;
	    }
	    else if (productType == SILVER_PRODUCT)
	    {
	      finalPrice = (initialPrice - (SILVER_PRODUCT_DISCOUNT_VALUE * initialPrice)) - accountDiscount * (initialPrice - (SILVER_PRODUCT_DISCOUNT_VALUE * initialPrice));
	    }
	    else if (productType == GOLD_PRODUCT)
	    {
	      finalPrice = (initialPrice - (GOLD_PRODUCT_DISCOUNT_VALUE * initialPrice)) - accountDiscount * (initialPrice - (GOLD_PRODUCT_DISCOUNT_VALUE * initialPrice));
	    }
	    else if (productType == PLATINUM_PRODUCT)
	    {
	      finalPrice = (initialPrice - (PLATINUM_PRODUCT_DISCOUNT_VALUE * initialPrice)) - accountDiscount * (initialPrice - (PLATINUM_PRODUCT_DISCOUNT_VALUE * initialPrice));
	    }
	    return finalPrice;
	  }
}
