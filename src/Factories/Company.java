package Factories;

import Products.Computer;
import Products.Headphones;

public abstract class Company {
	public abstract Computer createComputer();
	public abstract Headphones createHeadphones();
}
