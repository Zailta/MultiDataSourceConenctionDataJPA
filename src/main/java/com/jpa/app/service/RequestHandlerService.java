package com.jpa.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.app.entity.hotel.HotelEntity;
import com.jpa.app.entity.user.UserEntity;
import com.jpa.app.repo.hotel.HotelEntityRepository;
import com.jpa.app.repo.user.UserEntityrepository;

@Service
public class RequestHandlerService {

	@Autowired
	UserEntityrepository entityrepository;
	@Autowired
	HotelEntityRepository hotelEntityRepository;
	
	public Optional<UserEntity> findUserById(String user_id) {
		Optional<UserEntity> userbyId = entityrepository.findById(user_id);
		return  userbyId;
	}
	
	public Optional<HotelEntity> findHotelById(String hotel_id) {
		 Optional<HotelEntity> hotelbyId = hotelEntityRepository.findById(hotel_id);
		return  hotelbyId;
	}
}
