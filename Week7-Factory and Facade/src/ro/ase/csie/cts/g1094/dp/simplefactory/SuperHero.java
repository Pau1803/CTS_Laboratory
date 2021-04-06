package ro.ase.csie.cts.g1094.dp.simplefactory;

public class SuperHero {
	String name;
	AbstractWeapon weapon;
	

	public void setName(String name) {
		this.name = name;
	}


	public void setWeapon(AbstractWeapon weapon) {
		this.weapon = weapon;
	}


	public SuperHero(String name, AbstractWeapon weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}
	
	
}
