package com.example.demo.services.impl;

import com.example.demo.dao.AreaDao;
import com.example.demo.entity.Area;
import com.example.demo.services.AreaService;
import com.example.demo.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area queryAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean addArea(Area area) {
        if(Utils.isNotNullOrEmpty(area.getAreaName())){
            area.setCreatTime(new Date());
            area.setLastEditTime(new Date());
            try{
               int count = areaDao.insertArea(area);
               if(count == 1){
                   return true;
               }
               else{
                   throw new RuntimeException("Adding area failed.");
               }
            } catch(Exception e){
                throw new RuntimeException("Adding area failed.");
            }
        }
        else{
            throw new RuntimeException("Please enter the area name.");
        }
    }

    @Override
    public boolean updateArea(Area area) {
        if(Utils.validate(area)){
            Area updatedArea = new Area();
            updatedArea.setAreaName(area.getAreaName());
            updatedArea.setLastEditTime(new Date());
            try{
                int count = areaDao.updateArea(updatedArea);
                if(count == 1){
                    return true;
                }
                else{
                    throw new RuntimeException("Updating area failed.");
                }
            } catch(Exception e){
                throw new RuntimeException("Updating area failed.");
            }
        }
        else{
            throw new RuntimeException("Please enter the area name.");
        }    }

    @Override
    public boolean deleteArea(int areaId) {
        if(areaId > 0){
            try{
                int count = areaDao.deleteArea(areaId);
                if(count == 1){
                    return true;
                }
                else{
                    throw new RuntimeException("Deleting area failed.");
                }
            } catch(Exception e){
                throw new RuntimeException("Deleting area failed.");
            }
        }
        else{
            throw new RuntimeException("Please enter the correct areaId.");
        }    }
}
