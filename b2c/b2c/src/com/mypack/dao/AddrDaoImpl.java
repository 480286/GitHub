package com.mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mypack.entity.Addr;
import com.mypack.entity.User;

public class AddrDaoImpl extends BaseDao{

	public List<Addr> queryAllAddr(User user){
		List<Addr> addrLst = new ArrayList<Addr>();
		String sql="select * from address where username=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			rs = pstmt.executeQuery();
			while(rs.next()){
				int addressId=rs.getInt(1);
				String receiver=rs.getString(2);
				String region=rs.getString(3);
				String detailAddr=rs.getString(4);
				String phone=rs.getString(5);
//				String username=rs.getString(6);
				Addr addr = new Addr(addressId, receiver, region, detailAddr, phone, user);
				addrLst.add(addr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(rs, pstmt, conn);
		}
		return addrLst;
	}
	
	public boolean addAddress(Addr addr){
		boolean flag=false;
		String sql="insert into address where addressId=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, addr.getAddressId());
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
	
	public boolean updateAddress(Addr addr){
		boolean flag=false;
		String sql="update address set receiver=?,region=?,detailAddr=?,phone=? where addressId=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addr.getReceiver());
			pstmt.setString(2, addr.getRegion());
			pstmt.setString(3, addr.getDetailAddr());
			pstmt.setString(4, addr.getPhone());
			pstmt.setInt(5, addr.getAddressId());
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
	
	public Addr queryAddressById(int addressId){
		String sql="select * from address where addressId=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Addr addr=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, addressId);
			rs = pstmt.executeQuery();
			while(rs.next()){
				String receiver=rs.getString(2);
				String region=rs.getString(3);
				String detailAddr=rs.getString(4);
				String phone=rs.getString(5); 
				addr=new Addr(receiver, region, detailAddr, phone);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(rs, pstmt, conn);
		}
		return addr;
	}
	
	public boolean deleteAddress(int addressId){
		boolean flag=false;
		String sql="delete from address where addressId=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, addressId);
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
