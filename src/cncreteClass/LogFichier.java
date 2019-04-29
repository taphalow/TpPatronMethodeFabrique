package cncreteClass;

import java.io.FileWriter;
import java.io.PrintWriter;

import abstratClass.ILogger;

public class LogFichier implements ILogger {

	@Override
	public void log(String sClasse, String sInfo) {
		try {
			PrintWriter fichier = new PrintWriter(new FileWriter("journal.txt" , true));
			fichier.append(sClasse + " : " + sInfo + "\n");
			fichier.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
