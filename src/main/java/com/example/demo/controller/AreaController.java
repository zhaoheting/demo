package com.example.demo.controller;

import com.example.demo.entity.Area;
import com.example.demo.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/getAreaList",method = RequestMethod.GET)
    public Map<String,Object> getAreaList(){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("areaList", areaService.queryArea());
        return modelMap;
    }

    @RequestMapping(value="",method=RequestMethod.GET)
    public Map<String,Object> getAreaById(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("area", areaService.queryAreaById(areaId));
        return modelMap;
    }

    @RequestMapping(value="",method=RequestMethod.GET)
    public Map<String,Object> updateArea(Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("area", areaService.updateArea(area));
        return modelMap;
    }

    @RequestMapping(value="",method=RequestMethod.GET)
    public Map<String,Object> deleteArea(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("area", areaService.queryAreaById(areaId));
        return modelMap;
    }
}
