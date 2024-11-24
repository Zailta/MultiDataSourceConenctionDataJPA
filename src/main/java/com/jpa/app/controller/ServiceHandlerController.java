package com.jpa.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.app.entity.HotelEntity;
import com.jpa.app.entity.UserEntity;
import com.jpa.app.service.RequestHandlerService;

@RestController
@RequestMapping(value = "/app/v1/")
public class ServiceHandlerController {
	@Autowired
	RequestHandlerService entityService;
	
	@GetMapping(value ="getUser/{id}" )
	public ResponseEntity<UserEntity> getUserbyId(@PathVariable String id){
		 Optional<UserEntity> userById = entityService.findUserById(id);
		if(userById.isEmpty())
			return  new ResponseEntity<UserEntity>(userById.get(), HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<UserEntity>(userById.get(), HttpStatus.OK);

		
	}
	
	@GetMapping(value ="getHotel/{id}" )
	public ResponseEntity<HotelEntity> getHotelbyId(@PathVariable String id){
		 Optional<HotelEntity> hotelById = entityService.findHotelById(id);
		if(hotelById.isEmpty())
			return  new ResponseEntity<HotelEntity>(hotelById.get(), HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<HotelEntity>(hotelById.get(), HttpStatus.OK);

		
	}
	

}
