/**
 *
 * @(#) Test.java
 * @Package cn.lz.baomidispatch.storage.model
 * 
 * Copyright  Icerno Corporation. All rights reserved.
 *
 */

package com.example.demo.test.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description  = "测试模型实体")
public class Test {
    @ApiModelProperty(value = "主键", required = true)
    private Integer id;
    @ApiModelProperty(value = "内容", required = true)
    private String content;
    @ApiModelProperty(value = "是否有效0=无效，1=有效", required = true)
    private Integer isValid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
