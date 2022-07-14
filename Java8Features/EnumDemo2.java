package Java8Features;

public class EnumDemo2 {

	enum Restaurants {
		dominos, kfc, pizzahut, paninos, burgerking, Infy
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurants r = Restaurants.dominos;
		
		switch (r) { // The name of the enumertion constants are used without their enumeration
		case dominos: // only constants defined under enum Restaurants can be used
			System.out.println("I AM " + r.dominos);
			break;
		case kfc:
			System.out.println("I AM " + r.kfc);
			break;
		case pizzahut:
			System.out.println("I AM " + r.pizzahut);
			break;
		case paninos:
			System.out.println("I AM " + r.paninos);
			break;
		case burgerking:
			System.out.println("I AM " + r.burgerking);
			break;
		case Infy:
			System.out.println("I AM " + r.Infy);
		}
	}
}
