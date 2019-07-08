package com.mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mypack.entity.Address;

public class AddressDaoImpl extends BaseDao implements AddressDaoIF{

	//查询所有
	@Override
	public List<Address> queryAllAddress() {
		String sql="select * from address";
		List<Address> lst = new ArrayList<Address>();
		Connection conn = getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Address address=null;
		try {
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int add_id=rs.getInt(1);
				String add_name=rs.getString(2);
				String add_ssx=rs.getString(3);
				String add_xq=rs.getString(4);
				String add_yb=rs.getString(5);
				String add_tel=rs.getString(6);
				address=new Address(add_id, add_name, add_ssx, add_xq, add_yb, add_tel);
				lst.add(address);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(rs, pstmt, conn);
		return lst;
	}
	
	//查询单个
	@Override
	public Address queryOneAddress(int id) {
		String sql="select * from address where add_id=?";
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Address address=null;
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int add_id=rs.getInt(1);
				String add_name=rs.getString(2);
				String add_ssx=rs.getString(3);
				String add_xq=rs.getString(4);
				String add_yb=rs.getString(5);
				String add_tel=rs.getString(6);
				address=new Address(add_id, add_name, add_ssx, add_xq, add_yb, add_tel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(rs, pstmt, conn);
		return address;
	}
	
	//添加单个
	@Override
	public boolean addAddress(Address address) {
		boolean flag=false;
		String sql="insert into address(add_name,add_ssx,add_xq,add_yb,add_tel) values(?,?,?,?,?)";
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		int row=0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, address.getAdd_name());
			pstmt.setString(2, address.getAdd_ssx());
			pstmt.setString(3, address.getAdd_xq());
			pstmt.setString(4, address.getAdd_yb());
			pstmt.setString(5, address.getAdd_tel());
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(row>0) {
			flag=true;
		}
		close(pstmt, conn);
		return flag;
	}
	
	//删除单个
	@Override
	public boolean deletAddress(int id) {
		boolean flag=false;
		String sql="delete from address where add_id=?";
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		int row=0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(row>0) {
			flag=true;
		}
		close(pstmt, conn);
		return flag;
	}
	
	//修改单个
	@Override
	public boolean updateAddress(Address address) {
		boolean flag=false;
		String sql="update address set add_name=?,add_ssx=?,add_xq=?,add_yb=?,add_tel=? where add_id=? ";
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		int row=0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, address.getAdd_name());
			pstmt.setString(2, address.getAdd_ssx());
			pstmt.setString(3, address.getAdd_xq());
			pstmt.setString(4, address.getAdd_yb());
			pstmt.setString(5, address.getAdd_tel());
			pstmt.setInt(6, address.getAdd_id());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(row>0) {
			flag=true;
		}
		close(pstmt, conn);
		return flag;
	}
	
}
