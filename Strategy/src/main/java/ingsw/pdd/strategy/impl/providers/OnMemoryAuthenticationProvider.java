package ingsw.pdd.strategy.impl.providers;

import ingsw.pdd.strategy.impl.*;
import ingsw.pdd.strategy.util.*;

public class OnMemoryAuthenticationProvider implements IAuthenticationStrategy {
	@Override
	public Principal authenticate(String userName, String passwrd) {
		User user = OnMemoryDataBase.findUserByName(userName);
		if (user != null && user.getPassword().equals(passwrd)) {
			return new Principal(user.getUserName(), user.getRol());
		}

		return null;
	}
}
