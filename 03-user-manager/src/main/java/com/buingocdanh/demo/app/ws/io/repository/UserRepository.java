package com.buingocdanh.demo.app.ws.io.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.buingocdanh.demo.app.ws.io.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	@Query(value = "SELECT u.name FROM Users u")
	List<UserEntity> findAll();

}
