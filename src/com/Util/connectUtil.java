package com.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectUtil {

	public static Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
		} catch ( ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String user="sa";
		String password="980130";
		String url="jdbc:sqlserver://localhost:1433; DatabaseName=Bayes";
		Connection connection =null;
		
		try {
			connection=DriverManager.getConnection(url, user, password);
			System.out.println("数据库连接成功");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	public static void close(PreparedStatement preparedStatement) {
		
			 try {
				 if( preparedStatement !=null) {
				preparedStatement.close();
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void close(ResultSet resultSet)  {
		
			try {
				if(resultSet!= null) {
				resultSet.close();
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void close(Connection connection) {
		// TODO Auto-generated method stub
		
			try {
				if(connection!=null) {
				connection.close();
				}
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		connectUtil dbUtil=new connectUtil();
		try {
		connectUtil.getConnection();
		System.out.println("数据库连接成功！");
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("数据库连接失败");
		}
		}
}
