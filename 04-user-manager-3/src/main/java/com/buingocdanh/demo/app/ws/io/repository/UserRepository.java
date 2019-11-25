package com.buingocdanh.demo.app.ws.io.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.buingocdanh.demo.app.ws.io.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	/*public static final String FIND_USERS = "SELECT name, email FROM users";
	@Query(value = FIND_USERS, nativeQuery = true)
	List<UserEntity> findAll();
	*/
	@Query("select u.id,u.name,u.email, u.status from users u")
	Iterable<UserEntity> getAllUser();
	
	
}
