package com.mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mypack.entity.Goods;

public class GoodsDaoImpl extends BaseDao implements GoodsDaoIF{

	public Goods queryOneGoods(int goodsId){
		String sql="select * from goods where goodsId=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Goods goods=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, goodsId);
			rs=pstmt.executeQuery();
			if(rs.next()){
				int id=rs.getInt(1);
				String goodsName=rs.getString(2);
				int price=rs.getInt(3);
				int kucun=rs.getInt(4);
				String spec=rs.getString(5);
				String imgPath=rs.getString(6);
				String bak=rs.getString(7);
				goods=new Goods(id, goodsName, price, kucun, spec, imgPath, bak);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(rs, pstmt, conn);
		}
		return goods;
		
	}
	public List<Goods> queryAllGoods(){
		String sql="select * from goods";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Goods goods=null;
		List<Goods> lst=new ArrayList<Goods>();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				int goodsId=rs.getInt(1);
				String goodsName=rs.getString(2);
				int price=rs.getInt(3);
				int kucun=rs.getInt(4);
				String spec=rs.getString(5);
				String imgPath=rs.getString(6);
				String bak=rs.getString(7);
				goods=new Goods(goodsId, goodsName,price, kucun, spec, imgPath, bak);
				
				lst.add(goods);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(rs, pstmt, conn);
		}
		return lst;
	}
	
}
