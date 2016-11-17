package cn.mldn.dbc.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import cn.mldn.dbc.DatabaseConnection;;
/**
 * 
 * @author i317032
 * used for creating database connection
 * including method getConnection() to offer database connection.
 * implements interface DatabaseConnection to offer detailed connection creation.
 */
public class MySQLDatabaseConnection implements DatabaseConnection{
/**
 * mysql 驱动com.mysql.jdbc.Driver
 * mysql的JDBC URL编写方式： 
 *   	jdbc:mysql://主机名称：连接端口／数据库的名称？参数＝值
 *   连接端口默认为3306，可以在mysql输入：select global variables like “port”查询
 */
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/mldn";
	private static final String DBUSER = "root";
	private static final String DBPASSWORD = "000";
	
	private Connection conn = null;
	
	public MySQLDatabaseConnection() throws Exception{
		try{
			Class.forName(DBDRIVER);
			this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
			
		}catch(Exception e){
			throw e;
		}
		
	}
	
	public Connection getConnection(){
		return this.conn;
	}
	
	public void close() throws Exception{
		if(this.conn != null){
			try{
				this.conn.close();
			}catch(Exception e){
				throw e;
			}
		}
	}
	
}
