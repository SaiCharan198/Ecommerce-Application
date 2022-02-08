package com.capstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capstore.model.Shipping;

public interface CapRepository extends CrudRepository<Shipping,Long>{
	List<Shipping> findByCustomerId(long customerId);

}
