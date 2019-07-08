package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Addr;
import com.mypack.entity.User;

public interface AddrDaoIF {

	public List<Addr> queryAllAddr(User user);
	public boolean addAddress(Addr addr);
	public boolean updateAddress(Addr addr);
	public Addr queryAddressById(int addressId);
	public boolean deleteAddress(int addressId);
}
