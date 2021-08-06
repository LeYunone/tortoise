package com.tortoise.control;

import com.tortoise.bean.ResultBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengli
 * @create 2021-08-05 09:30
 */
@RestController
public class UserControl extends BaseControl {

    @RequestMapping("/login")
    public ResultBean loginUser(){
        ResultBean resultBean = getResultBean();
        return resultBean;
    }
}
