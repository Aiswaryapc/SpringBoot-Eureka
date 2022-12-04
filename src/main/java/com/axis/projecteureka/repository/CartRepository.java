package com.axis.projecteureka.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.projecteureka.entity.Cart;
import com.axis.projecteureka.entity.User;

public interface CartRepository extends JpaRepository<Cart, Integer>{
	
	List<Cart> findAllByUserOrderByCreatedDateDesc(User user);

}
