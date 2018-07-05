package com.smmot.suamo.controller.Impl;

import com.smmot.suamo.core.BaseController;
import com.smmot.suamo.core.ResultDataDto;
import com.smmot.suamo.entity.Order;
import com.smmot.suamo.entity.User;
import com.smmot.suamo.service.UserService;
import com.smmot.suamo.utils.ReturnJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController extends BaseController<User> implements com.smmot.suamo.controller.UserController {

    @Autowired
    private UserService userService;


    /**
     * 查询所有用户
     * @param response
     * @param request
     */
    @Override
    @GetMapping(value = "/selectuserlist")
    public void selectUserList(HttpServletResponse response, HttpServletRequest request) {
        ResultDataDto result = null;
        try{
            List<User> userList = userService.selectList();
            if (userList!=null){
                result = new ResultDataDto(ResultDataDto.CODE_SUCCESS,"查询成功",userList);
            }else {
                result = new ResultDataDto(ResultDataDto.CODE_ERROR_NULL,"查询结果值为空",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            result = new ResultDataDto(ResultDataDto.CODE_ERROR_EXCEPTION,"服务端异常",null);
        }
        ReturnJsonResult.result(response,request,result);
    }

    /**
     * 更具条件查询单个用户
     * @param u
     * @param response
     * @param request
     */
    @Override
    @PostMapping(value = "/selectUserByCondition")
    public void selectUserByCondition(User u, HttpServletResponse response, HttpServletRequest request) {
        ResultDataDto result = null;
        try{
              User user = userService.selectOne(u);
            if (user!=null){
                result = new ResultDataDto(ResultDataDto.CODE_SUCCESS,"查询成功",user);
            }else {
                result = new ResultDataDto(ResultDataDto.CODE_ERROR_NULL,"查询结果值为空",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            result = new ResultDataDto(ResultDataDto.CODE_ERROR_EXCEPTION,"服务端异常",null);
        }
        ReturnJsonResult.result(response,request,result);
    }


    /**
     * 更具下单条件查询单个用户
     * @param u
     * @param response
     * @param request
     */
    @Override
    @PostMapping(value = "/selectUserByOrder")
    public void selectUserByOrder(User u, HttpServletResponse response, HttpServletRequest request) {
        ResultDataDto result = null;
        try{
            User user = userService.selectOne(u);
            if (user!=null){
                Map<String,Object> modelMap = new HashMap<String, Object>();
                modelMap.put("user",user);
                if (user.getUserCompellation()!=null && user.getPhone() !=null){
                    result = new ResultDataDto(ResultDataDto.CODE_SUCCESS,"查询成功",modelMap);
                }else{
                    result = new ResultDataDto(ResultDataDto.CODE_ERROR_NULL,"用户名称或手机号码为空！！",modelMap);
                }

            }else {
                result = new ResultDataDto(ResultDataDto.CODE_ERROR_NULL,"查询结果值为空",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            result = new ResultDataDto(ResultDataDto.CODE_ERROR_EXCEPTION,"服务端异常",null);
        }
        ReturnJsonResult.result(response,request,result);
    }
}
