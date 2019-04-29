package abstratClass;

public abstract class AbstractCreatorPizza {
	private IPizza pizza;
	public IPizza getPizza() {
		return pizza;
	}
	public void setPizza(IPizza p) {
		this.pizza = p;
	}

	public abstract IPizza factoryMethod(String sPizza);
}
