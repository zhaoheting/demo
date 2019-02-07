package com.example.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value=Exception.class)
    public Map<String,Object> exceptionHandler(HttpServletRequest httpServletRequest, Exception e){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",false);
        modelMap.put("errorMessage", e.getCause());
        return modelMap;
    }
}
