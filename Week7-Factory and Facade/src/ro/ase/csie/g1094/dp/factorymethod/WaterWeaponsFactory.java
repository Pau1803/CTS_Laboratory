package ro.ase.csie.g1094.dp.factorymethod;

import ro.ase.csie.cts.g1094.dp.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1094.dp.simplefactory.WeaponType;

public class WaterWeaponsFactory extends AbstractFactory {
@Override
	public AbstractWeapon getWeapon(WeaponType type, String description) {
		
	
	 AbstractWeapon weapon = null;
	 switch(type) {
	 case PISTOL:
		 weapon = new WaterPistol();
	 case MACHINE_GUN:
		 weapon = new WaterBalloon();
	 case BAZOOKA:
		 weapon = new WaterBucket();
		 break;
		 default:
			 throw new UnsupportedOperationException();
			 
	 }
	 
	 return weapon;
	}

}
