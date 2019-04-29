package cncreteClass;

import abstratClass.AbstractLoggerFactory;
import abstratClass.ILogger;

public class Main {

	public static void main(String[] args) {
		AbstractLoggerFactory factory = new LoggerFactory(true);
		
		ILogger logger = factory.createLogger();
		
		logger.log(Main.class.toString(), "Bonjour");
		logger.log(Main.class.toString(), "tout le");
		logger.log(Main.class.toString(), "monde");
	}

}
