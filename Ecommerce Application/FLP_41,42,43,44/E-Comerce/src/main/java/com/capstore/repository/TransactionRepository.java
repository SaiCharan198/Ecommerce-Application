package com.capstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capstore.model.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction,Long>{
	List<Transaction> findByCustomerId(long customerId);

	//List<Transaction> findAllById(long custid);
}