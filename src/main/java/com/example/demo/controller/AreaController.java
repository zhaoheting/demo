package com.example.demo.controller;

import com.example.demo.entity.Area;
import com.example.demo.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    /**
     * Get all the areas.
     * @return
     */
    @RequestMapping(value = "/getAreaList",method = RequestMethod.GET)
    public Map<String,Object> getAreaList(){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("areaList", areaService.queryArea());
        return modelMap;
    }

    /**
     * Get the area by id.
     * @param areaId
     * @return
     */
    @RequestMapping(value="/getAreaById",method=RequestMethod.GET)
    public Map<String,Object> getAreaById(Integer areaId){
        int a = 1/0;
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("area", areaService.queryAreaById(areaId));
        return modelMap;
    }

    /**
     * Add a area.
     * @param area
     * @return
     */
    @RequestMapping(value="/getAreaById",method=RequestMethod.GET)
    public Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("area", areaService.addArea(area));
        return modelMap;
    }

    /**
     * Update the area.
     * @param area
     * @return
     */
    @RequestMapping(value="/modifyArea",method=RequestMethod.POST)
    public Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("area", areaService.updateArea(area));
        return modelMap;
    }

    /**
     * Delete the area by id.
     * @param areaId
     * @return
     */
    @RequestMapping(value="/deleteArea",method=RequestMethod.POST)
    public Map<String,Object> deleteArea(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("area", areaService.deleteArea(areaId));
        return modelMap;
    }
}
