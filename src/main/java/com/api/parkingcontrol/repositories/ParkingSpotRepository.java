package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {//passo o modelo e a chave única
	
	 boolean existsByLicensePlateCar(String licenserPlateCar);
	 boolean existsByParkingSpotNumber(String parkingSpotNumber);
	 boolean existsByApartmentAndBlock(String apartment, String block);
}