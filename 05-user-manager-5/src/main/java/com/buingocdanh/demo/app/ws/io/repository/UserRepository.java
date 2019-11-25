package com.buingocdanh.demo.app.ws.io.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.buingocdanh.demo.app.ws.io.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
	UserEntity findByEmail(String email);
	//UserEntity findByUserId(int userId);
}