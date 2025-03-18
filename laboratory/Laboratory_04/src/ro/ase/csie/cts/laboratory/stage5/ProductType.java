package ro.ase.csie.cts.laboratory.stage5;

public enum ProductType {
	NEW(0), SILVER(0.1f), GOLD(0.25f), PLATINUM(0.35f);
	
	private	float discount;
	
	public float getDiscount() {
		return this.discount;
	}
	
	private ProductType(float discount) {
		this.discount = discount;
	}
}
