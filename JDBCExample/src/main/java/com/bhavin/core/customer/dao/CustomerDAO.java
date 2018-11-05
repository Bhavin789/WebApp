package com.bhavin.core.customer.dao;

import com.bhavin.core.customer.model.*;

public interface CustomerDAO{
	public void insert(Customer customer);
	public Customer findByCutomerID(int id);
}