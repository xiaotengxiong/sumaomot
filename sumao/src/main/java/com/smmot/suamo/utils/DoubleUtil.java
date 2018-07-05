package com.smmot.suamo.utils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleUtil implements Serializable {
    private static final long serialVersionUID = -3345205828566485102L;
     // 默认除法运算精度
    private static final Integer DEF_DIV_SCALE = 2;

    /**
     * 提供精确的加法运算。
     * @param value1
     * @param value2
     * @return
     */
     public static Double add(Double value1, Double value2) {
         BigDecimal b1 = new BigDecimal(Double.toString(value1));
         BigDecimal b2 = new BigDecimal(Double.toString(value2));
         return b1.add(b2).doubleValue();
     }

    /**
     * 提供精确的减法运算。
     * @param value1
     * @param value2
     * @return
     */
     public static double sub(Double value1, Double value2) {
         BigDecimal b1 = new BigDecimal(Double.toString(value1));
         BigDecimal b2 = new BigDecimal(Double.toString(value2));
         return b1.subtract(b2).doubleValue();
     }

    /**
     * 提供精确的乘法运算。
     * @param value1
     * @param value2
     * @return
     */
      public static Double mul(Double value1, Double value2) {
          BigDecimal b1 = new BigDecimal(Double.toString(value1));
          BigDecimal b2 = new BigDecimal(Double.toString(value2));
          return b1.multiply(b2).doubleValue();
      }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时， 精确到小数点以后10位，以后的数字四舍五入。
     * @param dividend
     * @param divisor
     * @return
     */
    public static Double divide(Double dividend, Double divisor) {
        return divide(dividend, divisor, DEF_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算。 当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入。
     * @param dividend
     * @param divisor
     * @param scale
     * @return
     */
    public static Double divide(Double dividend, Double divisor, Integer scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
            }
            BigDecimal b1 = new BigDecimal(Double.toString(dividend));
            BigDecimal b2 = new BigDecimal(Double.toString(divisor));
            return b1.divide(b2, scale,RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * 提供指定数值的（精确）小数位四舍五入处理。
     * @param value
     * @param scale
     * @return
     */
    public static double round(double value,int scale){
        if(scale<0){
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
            }
            BigDecimal b = new BigDecimal(Double.toString(value));
            BigDecimal one = new BigDecimal("1");
            return b.divide(one,scale, RoundingMode.HALF_UP).doubleValue();
        }

}
