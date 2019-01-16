package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Area;

public interface AreaDao {

	/**
	 * 
	 * @return
	 */
	List<Area> queryArea();
	
	/**
	 * 
	 * @param areaId
	 * @return
	 */
	Area queryAreaById(int areaId);
	
	/**
	 * 
	 * @param area
	 * @return
	 */
	int insertArea(Area area);
	
	/**
	 * 
	 * @param area
	 * @return
	 */
	int updateArea(Area area);
	
	/**
	 * 
	 * @param area
	 * @return
	 */
	int deleteArea(Area area);
}
