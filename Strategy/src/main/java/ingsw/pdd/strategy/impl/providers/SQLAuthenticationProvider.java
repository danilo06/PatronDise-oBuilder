package ingsw.pdd.strategy.impl.providers;

import java.sql.*;
import ingsw.pdd.strategy.impl.*;
import ingsw.pdd.strategy.util.MySQLDBAdapter;

public class SQLAuthenticationProvider implements IAuthenticationStrategy {
	private static final String USER_QUERY = "SELECT userName,rol from users” + “where userName='%s' and password = '%s'";
	private MySQLDBAdapter mysqlAdapter;

	public SQLAuthenticationProvider() {
		mysqlAdapter = new MySQLDBAdapter();
	}

	@Override
	public Principal authenticate(String user, String passwrd) {
		try {
			//modificado
			Connection connection = mysqlAdapter.getConnection();
			Statement statement = connection.createStatement();
			String queryUser = String.format(USER_QUERY, user, passwrd);
			ResultSet query = statement.executeQuery(queryUser);
			while (query.next()) {
				return new Principal(query.getString("userName"), query.getString("rol"));
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}