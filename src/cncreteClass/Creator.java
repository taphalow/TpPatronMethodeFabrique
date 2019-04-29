package cncreteClass;

import abstratClass.AbstractCreatorPizza;
import abstratClass.IPizza;

public class Creator extends AbstractCreatorPizza {
	
	@Override
	public IPizza factoryMethod(String sPizza) {
		switch (sPizza) {
		case "SN":
			this.setPizza(new PizzaSN());
			break;

		case "ITA":
			this.setPizza(new PizzaItalie());
			break;
		}
		return getPizza();
	}

}
