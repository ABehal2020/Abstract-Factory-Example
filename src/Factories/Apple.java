package Factories;

import Products.AirPodsMax;
import Products.Computer;
import Products.Headphones;
import Products.MacBookPro;

public class Apple extends Company {
	@Override
	public Headphones createHeadphones() {
		return new AirPodsMax();
	}
	
	@Override
	public Computer createComputer() {
		return new MacBookPro();
	}

}