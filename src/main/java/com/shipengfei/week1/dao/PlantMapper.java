package com.shipengfei.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shipengfei.week1.domain.Plant;

public interface PlantMapper {

	List<Plant> selects(@Param("pname")String pname);

	int add(Plant p);

}
