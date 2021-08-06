package com.tortoise.control;

import com.tortoise.bean.ResultBean;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengli
 * @create 2021-08-06 10:41
 */
@RestController
public class ReptileControl extends BaseControl {

    public ResultBean downNovle(){
        ResultBean resultBean = getResultBean();


        return  resultBean;
    }
}
