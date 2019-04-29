package cncreteClass;

import abstratClass.AbstractLoggerFactory;
import abstratClass.ILogger;;

public class LoggerFactory extends AbstractLoggerFactory {

	public LoggerFactory(boolean b) {
		super(b);
	}

	@Override
	public ILogger createLogger() {
		if(this.isEcrire())
			return new LogFichier();
		return new LogConsole();			
	}

}
