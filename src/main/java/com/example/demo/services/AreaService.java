package com.example.demo.services;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaService {
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
    boolean addArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    boolean updateArea(Area area);

    /**
     * 删除区域
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
