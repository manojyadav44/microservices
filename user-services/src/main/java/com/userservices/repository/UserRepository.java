package com.userservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userservices.entity.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long > {
	
	UserInfo findByUserId(Long id);

}
