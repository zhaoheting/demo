package com.example.demo.dao;

import com.example.demo.entity.Area;

import java.util.List;

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
	 * @param areaId
	 * @return
	 */
	int deleteArea(int areaId);
}
