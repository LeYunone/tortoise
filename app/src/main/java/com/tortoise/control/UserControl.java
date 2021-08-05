package com.tortoise.control;

import com.tortoise.bean.ResultBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengli
 * @create 2021-08-05 09:30
 */
@RestController
public class UserControl {

    @RequestMapping("/login")
    public ResultBean loginUser(){

    }
}
