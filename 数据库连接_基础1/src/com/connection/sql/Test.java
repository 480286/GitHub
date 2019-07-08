package com.connection.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.cSql();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cSql() throws Exception{
		String sql = "select * from stu";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/air","root","root");
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int age=rs.getInt(3);
			String addres=rs.getString(4);
			String birthday=rs.getString(5);
			System.out.println();
			Student s = new Student(id,name,age,addres,birthday);
			s.show();
		}
		rs.close();
		ps.close();
		conn.close();
		
	
	}

}
