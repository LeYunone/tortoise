package com.tortoise.bean;

import lombok.*;

import java.util.List;

/**
 * @author pengli
 * @create 2021-08-05 17:27
 *
 *  交互结果集
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultBean {

    private String dataStr;

    private Object dataObj;

    private List<Object> listData;

    private Object[] dataObjs;
}
