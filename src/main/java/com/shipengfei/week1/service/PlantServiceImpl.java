package com.shipengfei.week1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipengfei.week1.dao.PlantMapper;
import com.shipengfei.week1.domain.Plant;


@Service
public class PlantServiceImpl implements PlantService {
	@Autowired
	private PlantMapper mapper;

	@Override
	public List<Plant> selects(String pname) {
		// TODO Auto-generated method stub
		return mapper.selects(pname);
	}

	@Override
	public int add(Plant p) {
		// TODO Auto-generated method stub
		return mapper.add(p);
	}
}
