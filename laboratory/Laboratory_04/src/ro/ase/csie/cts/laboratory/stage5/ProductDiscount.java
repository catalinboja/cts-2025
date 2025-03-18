package ro.ase.csie.cts.laboratory.stage5;

public class ProductDiscount {
	
	private IMarketingStrategy extraDiscountStrategy;
	
	public void setMarketingStrategy(IMarketingStrategy strategy) {
		this.extraDiscountStrategy = strategy;
	}
	
	private static float getProductTypeDiscountValue(ProductType productType, float initialPrice) {
		return productType.getDiscount() * initialPrice;
	}
	
	private float getPriceWithDiscount(float initialPrice, float discountValue) {	
		return initialPrice - discountValue;
	}

	
	public float getFinalPrice(ProductType productType, float initialPrice)
	  {
	    float finalPrice = 0;
	    	    
	    // Apply product type discount    
    	float productDiscountValue = getProductTypeDiscountValue(productType, initialPrice);
    	finalPrice = getPriceWithDiscount(initialPrice,productDiscountValue);
	    
	    // Apply extra discount
	    float extraDiscount = this.extraDiscountStrategy != null ? 
	    		this.extraDiscountStrategy.getExtraDiscount() : 0;
	    float extraDiscountValue = finalPrice * extraDiscount;
	    finalPrice = getPriceWithDiscount(finalPrice,extraDiscountValue);
	    
	    return finalPrice;
	  }
}
