package com.tortoise.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author pengli
 * @create 2021-08-05 14:46
 *
 * 爬虫结果集
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReptileObject implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<String> result;
}
