package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Address;

public interface AddressDaoIF {

	//查询所有
	List<Address> queryAllAddress();

	//查询单个
	Address queryOneAddress(int id);

	//添加单个
	boolean addAddress(Address address);

	boolean deletAddress(int id);

	boolean updateAddress(Address address);

}