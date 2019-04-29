package cncreteClass;

import abstratClass.ILogger;

public class LogConsole implements ILogger {

	@Override
	public void log(String sClasse, String sInfo) {
		System.out.println(sClasse +" : " + sInfo + "\n");
	}

}
