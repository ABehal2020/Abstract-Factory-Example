package Factories;

import Products.Computer;
import Products.Headphones;
import Products.SurfaceHeadphones;
import Products.SurfacePro;

public class Microsoft extends Company {
	@Override
	public Headphones createHeadphones() {
		return new SurfaceHeadphones();
	}
	
	@Override 
	public Computer createComputer() {
		return new SurfacePro();
	}
}

