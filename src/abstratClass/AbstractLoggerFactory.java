package abstratClass;

public abstract class AbstractLoggerFactory {
	private boolean ecrire;
	
	public AbstractLoggerFactory(boolean b) {
		setEcrire(b);
	}

	public boolean isEcrire() {
		return ecrire;
	}

	public void setEcrire(boolean ecrire) {
		this.ecrire = ecrire;
	}
	
	public abstract ILogger createLogger();
	
}
