package com.mmi.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmi.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	
	

}
