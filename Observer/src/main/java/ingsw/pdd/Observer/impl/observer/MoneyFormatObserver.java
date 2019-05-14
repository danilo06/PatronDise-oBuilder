package ingsw.pdd.Observer.impl.observer;

import ingsw.pdd.Observer.impl.ConfigurationManager;
import ingsw.pdd.Observer.impl.IObserver;

public class MoneyFormatObserver implements IObserver {
	@Override
	public void notifyObserver(String command, Object source) {
		if (command.equals("moneyFormat")) {
			ConfigurationManager conf = (ConfigurationManager) source;
			System.out.println(
					"Observer ==> MoneyFormatObserver.moneyFormatChange > " + conf.getMoneyFormat().format(1.11));
		}
	}
}