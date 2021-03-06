package com.baomidou.mybatisplus.samples.logic.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author xiaoguogai
 * @since 2019-11-26
 */
@Data
@Accessors(chain = true)
public class Common {

    private Long id;

    private String name;

    @TableLogic
    private Integer deleted;
}
