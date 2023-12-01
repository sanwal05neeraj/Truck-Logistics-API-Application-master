package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.Truck;

public interface TruckService {
	
	public List<Truck> getTrucks(); 
	public Truck getsingletruck(long truckId);
	public Truck addTruck(Truck truck);
	public Truck updateTruck(Truck truck);
	public void deleteTruck(long parseLong);
	
	

}
