package ro.ase.csie.cts.laboratory.stage4;

public class ProductDiscount {
	
	public static final int ACCOUNT_AGE_LIMIT_DISCOUNT = 10;
	public static final float MAX_ACCOUNT_DISCOUNT_VALUE = 0.15f;

	
	private static float getProductTypeDiscountValue(ProductType productType, float initialPrice) {
		return productType.getDiscount() * initialPrice;
	}
	
	private float getPriceWithDiscount(float initialPrice, float discountValue) {	
		return initialPrice - discountValue;
	}
	
	private static float getAccountDiscount(int userAccountAge) {
	    float accountDiscount = 
	    		(userAccountAge > ACCOUNT_AGE_LIMIT_DISCOUNT) ? MAX_ACCOUNT_DISCOUNT_VALUE : (float)userAccountAge/100; 
	    return accountDiscount;
	}
	
	
	public float getFinalPrice(
			ProductType productType, 
			float initialPrice, 
			int userAccountAge)
	  {
	    float finalPrice = 0;
	    	    
	    // Apply product type discount    
    	float productDiscountValue = getProductTypeDiscountValue(productType, initialPrice);
    	finalPrice = getPriceWithDiscount(initialPrice,productDiscountValue);
	    
	    // Apply account discount
	    float accountDiscount = getAccountDiscount(userAccountAge);
	    float accountDiscountValue = finalPrice * accountDiscount;
	    finalPrice = getPriceWithDiscount(finalPrice,accountDiscountValue);
	    
	    return finalPrice;
	  }
}
