package com.jpa.app.repo.hotel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.app.entity.hotel.HotelEntity;
import com.jpa.app.entity.user.UserEntity;

@Repository
public interface HotelEntityRepository extends JpaRepository<HotelEntity, String>{
	
	Optional<HotelEntity> findById(String hotel_id);
}
