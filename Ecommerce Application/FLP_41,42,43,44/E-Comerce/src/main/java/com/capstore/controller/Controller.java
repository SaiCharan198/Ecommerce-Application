package com.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstore.model.Cart;
import com.capstore.model.Shipping;
import com.capstore.model.Transaction;
import com.capstore.repository.CapRepository;
import com.capstore.repository.CartRepository;
import com.capstore.repository.TransactionRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
	@Autowired 
	CapRepository repository;
	@Autowired 
	TransactionRepository trepository;
	@Autowired 
	CartRepository crepository;
	public long revenue;
//checking,updating and status of delivery
	
	@PostMapping(value="/update/{orderId}")
	public Shipping updateStatus(@PathVariable long orderId,@RequestParam String status) {
	Shipping s=	repository.findById(orderId).get();
	s.setStatus(status);
//	List<Shipping> list=repository.findByCustomerId(custId);
//	for(Shipping w:list) {
//		if(w.getProductId()==productId) {
//			w.setStatus(status);
//			repository.save(w);
//			return w;
//		}
//		else 
//			System.out.println("jhfgjhg");
//		
//	}
	repository.save(s);
		return s;
		
		
	}
	@GetMapping(value="/check/{orderId}")
	public Shipping checking(@PathVariable long orderId) {
	Shipping s=	repository.findById(orderId).get();
	
//	List<Shipping> list=repository.findByCustomerId(custId);
//	for(Shipping w:list) {
//		if(w.getProductId()==productid) {
//
//			return w.getStatus();
//		}
//		else 
//			System.out.println("jhfgjhg");
//		
//	}
		
		return s;
		
		
	}
	
	@GetMapping(value="/findall")
	public long findall() {
		
	revenue=0;
		List<Shipping> list1=(List<Shipping>) repository.findAll();
		for(Shipping w:list1) {
			revenue=(long) (revenue+w.getPrice());
		}
		
		return revenue;
		
	}
	@GetMapping(value="/getTransactions/{custid}")
	public List getTransactions(@PathVariable long custid) {
		List<Shipping> s=	(List<Shipping>) repository.findById(custid).get();
		return s;
	}
	@GetMapping(value="/transaction/{custId}")
	public List transactions(@PathVariable long custId) {
		List<Transaction> s=	(List<Transaction>) trepository.findByCustomerId(custId);
		return s;
	}
	
	
	@DeleteMapping(value="/purchase/{sno}")
	public void purchase(@PathVariable long sno) {
 
		 long orderid = (long) (Math.random()*200);
//		Cart cart=(Cart) crepository.findByCustomerIdAndProductId(customerid,productId);
		Cart cart=crepository.findById(sno).get();
		Shipping ship=new Shipping();
		ship.setOrderId(orderid);
		ship.setProductId(cart.getProductId());
		ship.setCustomerId(cart.getCustomerId());
		System.out.println(cart.getCustomerId());

		

		repository.save(ship);
		
		crepository.deleteById(sno);
		
		
//		 crepository.deleteByCustomerIdAndProductId(customerid,productId);                    
		 
		 
//		return s;
	}
	@DeleteMapping(value="/remove/{sno}")
	public void remove(@PathVariable long sno) {
		crepository.deleteById(sno);
	}
	@GetMapping(value="/cart/{customerid}")
	public List cart(@PathVariable long customerid) {
		List<Cart> s=	(List<Cart>) crepository.findByCustomerId(customerid);
		return s;
	}
}

	
	
	

