package cncreteClass;

import abstratClass.IPizza;

public class PizzaItalie implements IPizza{

	@Override
	public void service() {
		System.out.println("Pizza Italienne\n");
	}

}
