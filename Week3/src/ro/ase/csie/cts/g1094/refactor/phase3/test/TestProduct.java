package ro.ase.csie.cts.g1094.refactor.phase3.test;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.Product;
import ro.ase.csie.cts.gr1094.refractor.phase1.ProductType;

public class TestProduct {

	public static void main(String[] args) {
		
		
		Product product = new Product();
		try {
			float finalPrice=
					product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is" + finalPrice);
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}