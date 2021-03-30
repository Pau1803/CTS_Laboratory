package ro.ase.csie.cts.gr1094.dp.builder;

public class SuperHeroDirector {
	SuperHero.SuperHeroBuilder builder;
	
	public SuperHeroDirector(SuperHero.SuperHeroBuilder builder) {
		this.builder=builder;
	}
	
	public SuperHero buildJoker() {
		return builder
				.isVillain()
  				.addLeftWeapon(new Pistol())
  				.addRightWeapon(new Pistol())
  				.build();
	}
	
	public SuperHero buildSuperman() {
		return builder
  				.addSuperPower("Fly")
  				.addLeftWeapon(new Pistol())
  				.build();
	}
}
