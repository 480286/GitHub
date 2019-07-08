package com.mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mypack.entity.User;

public class UserDaoImpl extends BaseDao implements UserDaoIF{

	public User queryUserByUserName(User user){
		String sql="select * from user where userName=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		User u=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			rs=pstmt.executeQuery();
			if(rs.next()){
				String userName=rs.getString(1);
				String password=rs.getString(2);
				u = new User(userName, password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(rs, pstmt, conn);
		}
		return u;
	}
	
	public boolean addUser(User user){
		boolean flag=false;
		String sql="insert into user value(?,?)";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
/*			pstmt.setString(3, user.getPhone());
			pstmt.setString(4, user.getQq());
			pstmt.setString(5, user.getEmail());*/
			int row=pstmt.executeUpdate();
			if(row>0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(pstmt, conn);
		}
		return flag;
	}
	
	
}
