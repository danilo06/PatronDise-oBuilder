package ingsw.pdd.Observer.impl.observer;

import java.util.Date;
import ingsw.pdd.Observer.impl.ConfigurationManager;
import ingsw.pdd.Observer.impl.IObserver;

public class DateFormatObserver implements IObserver {

	@Override
	public void notifyObserver(String command, Object source) {
		if (command.equals("defaultDateFormat")) {
			ConfigurationManager conf = (ConfigurationManager) source;
			System.out.println("Observer ==> DateFormatObserver.dateFormatChange > "
					+ conf.getDefaultDateFormat().format(new Date()));
		}
	}
}
