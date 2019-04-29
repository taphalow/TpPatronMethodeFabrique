package cncreteClass;

import abstratClass.AbstractCreatorPizza;
import abstratClass.IPizza;

public class Client {

	public static void main(String[] args) {
		AbstractCreatorPizza creator = new Creator();
		
		IPizza produit = creator.factoryMethod("SN");
		produit.service();
		
		produit = creator.factoryMethod("ITA");
		produit.service();
	}

}
