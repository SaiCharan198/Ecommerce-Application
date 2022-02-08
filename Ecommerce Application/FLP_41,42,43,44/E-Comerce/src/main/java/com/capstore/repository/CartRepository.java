package com.capstore.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.capstore.model.Cart;

public interface CartRepository  extends CrudRepository<Cart,Long>{
	List<Cart> findByCustomerId(long customerId);
	List<Cart> findByCustomerIdAndProductId(long customerId,long productId);
	void deleteByCustomerIdAndProductId(long customerId,long productId);
}
