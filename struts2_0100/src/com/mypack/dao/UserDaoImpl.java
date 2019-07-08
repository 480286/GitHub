package com.mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mypack.entity.User;

public class UserDaoImpl extends BaseDao{

	public User queryOneUser(User user) {
		String sql = "select * from user where id=?";
		
		Connection conn = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		User u =null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getName());
			rs = ps.executeQuery();
			if(rs.next()) {
				String name = rs.getString(1);
				String password = rs.getString(2);
				u = new User(name, password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs, ps, conn);
		return u;
 	}
}
