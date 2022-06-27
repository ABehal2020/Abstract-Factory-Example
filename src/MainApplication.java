import Factories.Apple;
import Factories.Company;
import Factories.Microsoft;
import Products.Computer;
import Products.Headphones;

public class MainApplication {
	public static void main(String[] args) {
		Company microsoft = new Microsoft();
		Computer surfacePro = microsoft.createComputer();
		surfacePro.build();
		Headphones surfaceHeadphones = microsoft.createHeadphones();
		surfaceHeadphones.build();
		
		Company apple = new Apple();
		Computer macBookPro = apple.createComputer();
		macBookPro.build();
		Headphones airPodsMax = apple.createHeadphones();
		airPodsMax.build();
	}
}
