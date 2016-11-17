package cn.mldn.factory;
import cn.mldn.dbc.DatabaseConnection;
import cn.mldn.dbc.impl.MySQLDatabaseConnection;;
public class DatabaseConnectionFactory {
	
	public static DatabaseConnection getDatabaseConnection() throws Exception{
		return new MySQLDatabaseConnection();
	}
	 
}
