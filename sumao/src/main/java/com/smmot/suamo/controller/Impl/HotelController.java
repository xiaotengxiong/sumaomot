package com.smmot.suamo.controller.Impl;

import com.smmot.suamo.core.BaseController;
import com.smmot.suamo.core.ResultDataDto;
import com.smmot.suamo.entity.Hotel;
import com.smmot.suamo.entity.Pirture;
import com.smmot.suamo.entity.Price;
import com.smmot.suamo.service.HotelService;
import com.smmot.suamo.service.PirtureService;
import com.smmot.suamo.service.PriceService;
import com.smmot.suamo.utils.ReturnJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HotelController extends BaseController<Hotel> implements com.smmot.suamo.controller.HotelController {

   @Autowired
   private HotelService hotelService;

   @Autowired
   private PirtureService pirtureService;

   @Autowired
   private PriceService priceService;

    /**
     * 查询所有酒店
     * @param response
     * @param request
     */
    @Override
    @GetMapping(value = "/showHoteles")
    public void  showHotels(HttpServletResponse response, HttpServletRequest request) {
        Map<String,Object> modelMap = new HashMap<String, Object>();
        ResultDataDto result = null;
        try{
            List<Hotel> hotelList = hotelService.selectListAndMinPrice();
            modelMap.put("hotelList",hotelList);
            if (hotelList!=null){
                result = new ResultDataDto(ResultDataDto.CODE_SUCCESS,"查询成功",modelMap);
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
     * 根据条件查询一个酒店
     * @param hotel
     * @param response
     * @param request
     */
    @Override
    @PostMapping(value = "/selectOneHotelAll")
    public void selectOneHotelAll(Hotel hotel,HttpServletResponse response, HttpServletRequest request) {
        ResultDataDto result = null;
        try{
            Hotel h= hotelService.selectOne(hotel);

            Pirture pirture = new Pirture();
            pirture.setHotelId(hotel.getHotelId());
            List<Pirture> pirtureList = pirtureService.selectList(pirture);

            Price price = new Price();
            price.setHotelId(hotel.getHotelId());
            List<Price> priceList = priceService.selectListALLMsg(price);

            Map<String,Object> modelMap = new HashMap<String, Object>();

            modelMap.put("hotel",h);
            modelMap.put("pirtureList",pirtureList);
            modelMap.put("priceList",priceList);
            if (h!=null){
                result = new ResultDataDto(ResultDataDto.CODE_SUCCESS,"查询成功",modelMap);
            }else {
                result = new ResultDataDto(ResultDataDto.CODE_ERROR_NULL,"查询结果值为空",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            result = new ResultDataDto(ResultDataDto.CODE_ERROR_EXCEPTION,"服务端异常",null);
        }
        ReturnJsonResult.result(response,request,result);
    }

    @Override
    @GetMapping(value = "/te")
    public String test() {
        return "asdaiwhdaww";
    }


}
