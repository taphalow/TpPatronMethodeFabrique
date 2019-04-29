package cncreteClass;

import abstratClass.IPizza;

public class PizzaSN implements IPizza {

	@Override
	public void service() {
		System.out.println("Pizza Sénégalaise\n");		
	}

}
