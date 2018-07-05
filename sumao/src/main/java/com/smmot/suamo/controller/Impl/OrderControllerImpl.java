package com.smmot.suamo.controller.Impl;

import com.smmot.suamo.controller.OrderController;
import com.smmot.suamo.core.BaseController;
import com.smmot.suamo.core.ResultDataDto;
import com.smmot.suamo.entity.Hotel;
import com.smmot.suamo.entity.Order;
import com.smmot.suamo.entity.Price;
import com.smmot.suamo.service.OrderService;
import com.smmot.suamo.service.PriceService;
import com.smmot.suamo.utils.DoubleUtil;
import com.smmot.suamo.utils.ReturnJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class OrderControllerImpl extends BaseController<Order> implements OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PriceService priceService;


    @Override
    @PostMapping(value = "/insertOrder")
    public void insertOrder(Order order, HttpServletResponse response, HttpServletRequest request) {
        ResultDataDto result = null;
        try{
            Price price = new Price();
            price.setPriceId(order.getPriceId());
            price = priceService.selectOneByPriceId(price);

            order.setHotelName(price.getPhotelName());
            order.setRoomTypeName(price.getRoomTypeName());

            Double totalPrice = DoubleUtil.mul(price.getRoomPrice(),order.getOrderNumber().doubleValue());
            order.setOrderTotalPrice(totalPrice);

            Integer info = orderService.insert(order);
            Map<String,Object> modelMap = new HashMap<String, Object>();
            modelMap.put("info",info);
            if (info == 1){
                result = new ResultDataDto(ResultDataDto.CODE_SUCCESS,"添加成功",modelMap);
            }else {
                result = new ResultDataDto(ResultDataDto.CODE_ERROR_NULL,"添加失败",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            result = new ResultDataDto(ResultDataDto.CODE_ERROR_EXCEPTION,"服务端异常",null);
        }
        ReturnJsonResult.result(response,request,result);
    }
}
