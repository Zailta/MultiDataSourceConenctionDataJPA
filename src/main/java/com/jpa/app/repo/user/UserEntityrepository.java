package com.jpa.app.repo.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.app.entity.user.UserEntity;

@Repository
public interface UserEntityrepository extends JpaRepository<UserEntity, String>{
	
	Optional<UserEntity> findById(String user_id);
}
