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
			    System.out.println("�����ͺ��̽��� ���������� �����Ͽ����ϴ�."); 
			} catch (Exception e) { 
				e.printStackTrace(); 
			}
	}
	
	public static void main(String args[]) {
		new DBconnect("root", "mysql5");
	}
}
