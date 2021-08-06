package com.tortoise.control;

import com.tortoise.bean.ResultBean;

/**
 * @author pengli
 * @create 2021-08-05 17:30
 *
 * 控制类 核心基类
 */
public class BaseControl {
   public ResultBean getResultBean(){
       ResultBean result= ResultBean.builder().build();
       return result;
   }
}
