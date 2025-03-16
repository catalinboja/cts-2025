package ro.ase.csie.cts.laboratory.stage3;

public class ProductDiscount {
	
	public static final int ACCOUNT_AGE_LIMIT_DISCOUNT = 10;
	public static final float MAX_ACCOUNT_DISCOUNT_VALUE = 0.15f;

	
	private static float getDiscountValue(ProductType productType, float initialPrice) {
		return productType.getDiscount() * initialPrice;
	}
	
	private float getFinalProductPriceWithDiscount(float initialPrice, float accountDiscount, ProductType productType) {
		
		float discountValue = getDiscountValue(productType, initialPrice);
		float priceWithoutDiscount = initialPrice - discountValue;
		
		return (1 - accountDiscount)* priceWithoutDiscount;
	}
	
	
	public float getFinalPrice(
			ProductType productType, 
			float initialPrice, 
			int userAccountAge)
	  {
	    float finalPrice = 0;
	    float accountDiscount = 
	    		(userAccountAge > ACCOUNT_AGE_LIMIT_DISCOUNT) ? MAX_ACCOUNT_DISCOUNT_VALUE : (float)userAccountAge/100; 
	    
	    if(productType == ProductType.NEW) {
	    	finalPrice = initialPrice;
	    }
	    else {
	    	finalPrice = getFinalProductPriceWithDiscount(initialPrice,accountDiscount,productType);
	    }
	    
	    return finalPrice;
	  }
}
