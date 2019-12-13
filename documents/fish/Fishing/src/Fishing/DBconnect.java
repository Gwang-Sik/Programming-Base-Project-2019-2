package Fishing;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	Connection con;
	public DBconnect(String id,String pass){
		try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	String url = "jdbc:mysql://localhost:3306/library?characterEncoding=UTF-8&serverTimezone=UTC";
			    con = DriverManager.getConnection(url, id, pass);
			    System.out.println("데이터베이스에 성공적으로 연결하였습니다."); 
			} catch (Exception e) { 
				e.printStackTrace(); 
			}
	}
	
	public static void main(String args[]) {
		new DBconnect("root", "mysql5");
	}
}
