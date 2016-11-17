package cn.mldn.dbc;
import java.sql.Connection;
/**
 * 
 * @author i317032
 * interface of database connection. 
 * use implements to define real connection.
 * but use type DatabaseConnection to manage.
 * this release man to manage detailed database connection implementation.
 */
public interface DatabaseConnection {
	public Connection getConnection();
	public void close() throws Exception;
}
