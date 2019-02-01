package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Area;

public interface AreaDao {

	/**
	 * 返回所有area
	 * @return
	 */
	List<Area> queryArea();
	
	/**
	 * 根据id查询area
	 * @param areaId
	 * @return
	 */
	Area queryAreaById(int areaId);
	
	/**
	 * 插入单个area
	 * @param area
	 * @return
	 */
	int insertArea(Area area);
	
	/**
	 * 更新区域信息
	 * @param area
	 * @return
	 */
	int updateArea(Area area);
	
	/**
	 * 删除区域
	 * @param area
	 * @return
	 */
	int deleteArea(int areaId);
}
