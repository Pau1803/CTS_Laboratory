package ro.ase.csie.cts.gr1094.refractor.phase1;

public enum ProductType {
	NEW(0), DISCOUNTED(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);  //enum are classes use them as classes
	
	private float discountValue;
	
	private ProductType(float discount) {
		this.discountValue =discount;
		
	}
	
	public float getDiscount() {
		return discountValue;
	}
	
	
}
