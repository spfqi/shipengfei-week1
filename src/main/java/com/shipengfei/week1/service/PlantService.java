package com.shipengfei.week1.service;

import java.util.List;

import com.shipengfei.week1.domain.Plant;


public interface PlantService {

	List<Plant> selects(String pname);

	int add(Plant p);

}
