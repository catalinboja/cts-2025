package ro.ase.csie.cts.laboratory.stage5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDiscount productDiscount = new ProductDiscount();
		productDiscount.setMarketingStrategy(new ExtraAccountDiscountStrategy(12));
		float finalPrice = productDiscount.getFinalPrice(ProductType.GOLD, 100);
		
		System.out.println("Final price is " + finalPrice);
	}

}
