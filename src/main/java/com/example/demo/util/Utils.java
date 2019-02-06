package com.example.demo.util;

public class Utils {

    /**
     * Validate the string when it's null or "".
     * @param str
     * @return
     */
    public static boolean isNotNullOrEmpty(String str){
        if(str == null || "".equals(str)){
            return false;
        }
        else
            return true;
    }

    public static boolean validate(Object o){
        return false;
    }

    public static boolean validateCollector(Object o){
        return false;
    }
}
