package com.jpa.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.app.entity.UserEntity;

@Repository
public interface UserEntityrepository extends JpaRepository<UserEntity, String>{
	
	Optional<UserEntity> findById(String user_id);
}
