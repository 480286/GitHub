package com.mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mypack.entity.Goods;
import com.mypack.entity.Item;
import com.mypack.entity.User;

public class CartDaoImpl extends BaseDao implements CartDaoIF{

	public boolean addCart(Item item){
		boolean flag=false;
		String sql="insert into cart(goodsId,nums,username) values(?,?,?)";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, item.getGood().getGoodsId());
			pstmt.setInt(2, item.getNums());
			pstmt.setString(3, item.getUser().getUserName());
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
	public List<Item> queryAllCart(User user){
		String sql="select c.itemId,c.goodsId,c.nums,g.goodsName,g.price,g.kucun,g.spec,g.imgPath,g.bak from cart c,goods g where c.goodsId=g.goodsId and c.username=?";
		
		List<Item> itemLst=new ArrayList<Item>();
		
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Item item = null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			rs=pstmt.executeQuery();
			while(rs.next()){
				int itemId=rs.getInt(1);
				int goodsId=rs.getInt(2);
				int nums=rs.getInt(3);
				String goodsName=rs.getString(4);
				int price=rs.getInt(5);
				int kucun=rs.getInt(6);
				String spec=rs.getString(7);
				String imgPath=rs.getString(8);
				String bak=rs.getString(9);
				Goods good = new Goods(goodsId, goodsName, price, kucun, spec, imgPath, bak);
				item = new Item(itemId, good, nums, user);
				itemLst.add(item);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(rs, pstmt, conn);
		}
		return itemLst;
		
	}
	
	public boolean updateCart(Item item){
		boolean flag=false;
		String sql="update cart set nums=? where username=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, item.getNums());
			pstmt.setString(2, item.getUser().getUserName());
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
	
	public boolean deleteCartById(int itemId){
		boolean flag=false;
		String sql="delete form cart where itemid=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, itemId);
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
	public boolean deleteCart(int itemId) {
		// TODO Auto-generated method stub
		return false;
	}
}
