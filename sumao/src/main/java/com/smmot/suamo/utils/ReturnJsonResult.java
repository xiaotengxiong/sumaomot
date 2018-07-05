package com.smmot.suamo.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.smmot.suamo.core.ResultDataDto;
import com.sun.jmx.snmp.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by IntelliJ IDEA.
 * User: adams
 * Date:  2018/1/30
 * Time: 15:21
 */
public class ReturnJsonResult {

    public static String resultJson(HttpServletResponse response, HttpServletRequest request, ResultDataDto resultDto){

        String back = request.getParameter("callback");
        Gson gson =  new GsonBuilder().registerTypeAdapter(Timestamp.class, new TimestampGsonAdapter("yyyy-MM-dd")).setDateFormat("yyyy-MM-dd").create();
        String result = "";
        if(back == null || back.equals("")){
            result =  gson.toJson(resultDto);
        }else{
            result =  back+"("+gson.toJson(resultDto)+")";//跨域访问请求返回数据
        }
        return result;
    }


    public String ResultJsonToDatagrid(HttpServletResponse response, HttpServletRequest request, Object data, Integer total){
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("total", total);
        jsonObj.put("rows", data);

        String back = request.getParameter("callback");
        Gson gson =  new GsonBuilder().registerTypeAdapter(Timestamp.class, new TimestampGsonAdapter("yyyy-MM-dd")).setDateFormat("yyyy-MM-dd").create();
        String result = "";
        if(back == null || back.equals("")){
            result =  gson.toJson(jsonObj);
        }else{
            result =  back+"("+gson.toJson(jsonObj)+")";//跨域访问请求返回数据
        }
        return result;
    }
    /*
     * 编码
     */
    public String encodeStr(String str) {
        try {
            return new String(str.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void resultString(HttpServletResponse response, HttpServletRequest request, String str){
        response.setContentType("application/json; charset=utf-8");
        String back = request.getParameter("callback");
        String result = "";
        if(back == null || back.equals("")){
            result =  str;
        }else{
            result =  back+"("+str+")";//跨域访问请求返回数据
        }
        try {
            response.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  static void result(HttpServletResponse response, HttpServletRequest request, ResultDataDto resultDto){

        response.setContentType("application/json; charset=utf-8");
        try {
            response.getWriter().write(resultJson(response, request,resultDto));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
