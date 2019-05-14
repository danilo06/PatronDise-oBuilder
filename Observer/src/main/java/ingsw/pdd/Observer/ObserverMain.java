package ingsw.pdd.Observer;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import ingsw.pdd.Observer.impl.ConfigurationManager;
import ingsw.pdd.Observer.impl.observer.*;;

public class ObserverMain {

	public static void main(String[] args) {
		ConfigurationManager conf = ConfigurationManager.getInstance();

		// Se establecen los valores por default.
		conf.setDefaultDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
		conf.setMoneyFormat(new DecimalFormat("##.00"));
		System.out.println("Configuración establecida");

		// Se dan de alta lo observers
		DateFormatObserver dateFormatObserver = new DateFormatObserver();
		MoneyFormatObserver moneyFormatObserver = new MoneyFormatObserver();
		conf.addObserver(dateFormatObserver);
		conf.addObserver(moneyFormatObserver);
		System.out.println("");

		// Se cambia la configuración
		conf.setDefaultDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
		conf.setMoneyFormat(new DecimalFormat("###,#00.00"));
		System.out.println("");

		// Se realiza otro cambio en la configuración.
		conf.setDefaultDateFormat(new SimpleDateFormat("MM/yyyy/dd"));
		conf.setMoneyFormat(new DecimalFormat("###,#00"));

		conf.removeObserver(dateFormatObserver);
		conf.removeObserver(moneyFormatObserver);
		System.out.println("");

		// Se realiza otro cambio en la configuración.
		conf.setDefaultDateFormat(new SimpleDateFormat("MM/yyyy"));
		conf.setMoneyFormat(new DecimalFormat("###,##0.00"));
	}
}