package com.example.grpcclient.domo.util;

public class ParamUtils {
    public static String getString(String paramName) {
        return paramName == null ? "" : paramName;
    }

    public static String getString(Object paramName) {
        return paramName == null ? "" : paramName.toString();
    }


    public static Integer getInt(Integer paramName){
        return paramName == null ? -999 : paramName;
    }
}
