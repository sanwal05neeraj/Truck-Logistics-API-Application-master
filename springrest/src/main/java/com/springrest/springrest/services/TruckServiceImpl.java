package com.springrest.springrest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.springrest.springrest.dao.TruckDao;
import com.springrest.springrest.entities.Truck;
@Service

public class TruckServiceImpl implements TruckService {
	@Autowired
	private TruckDao truckDao;
	
	List<Truck> list;
	
	public TruckServiceImpl() {
	
//		list = new ArrayList<>();
//		list.add(new Course(145, "Java Core Course", "this course contains basics of JAVA"));
//		list.add(new Course(4343, "Spring Boot Course", "Creating Spring Boot Course"));
	}
	
	@Override
	public List<Truck> getTrucks() {
		
		//return list;
		return truckDao.findAll();
	}

	@Override
	public Truck getsingletruck(long truckId) {
//		Course c = null;
//		for (Course course:list) {
//			if(course.getId()==courseId) {
//				c = course;
//				break;
//			}
//		}
		//return c;
		return truckDao.getReferenceById(truckId);
		
	}

	@Override
	public Truck addTruck(Truck truck) {
//		list.add(course);
		//return course;
		
		truckDao.save(truck);
		return truck;
		
	}

	@Override
	public Truck updateTruck(Truck truck) {
//		list.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		truckDao.save(truck);
		return truck;
	}

	@Override
	public void deleteTruck(long parseLong) {
		// list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Truck entity = truckDao.getReferenceById(parseLong);
		truckDao.delete(entity);
	}
	
	

}
