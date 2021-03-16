package ro.ase.csie.cts.g1094.refactor.phase3.services;

public class Marketing2021Strategy implements MarketingServiceInterface {

	private static final int MAX_AGE_ACCOUNT = 0;
	private static final float MAX_FIDELITY_DISCOUNT = 0;

	public float getFidelityDiscount(int accountAge) {
		return (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIDELITY_DISCOUNT : (float)accountAge/100; 
	}
}
