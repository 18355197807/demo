/**
 *
 * @(#) TestController.java
 * @Package cn.lz.baomidispatch.storage.web
 * 
 * Copyright  Icerno Corporation. All rights reserved.
 *
 */

package com.example.demo.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.test.model.Test;


@Api(value = "测试")
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("findAll")
    @ApiOperation(value="获取列表数据", notes="获取列表下测试数据")
    public String list() {
        return "查询列表数据!";
    }

    @GetMapping("find")
    @ApiOperation(value="获取ID数据", notes="根据ID获取某条测试数据")
    public String find(Integer id) {
        return String.format("根据主键查询数据: %d", id);
    }

    @PostMapping("save")
    @ApiOperation(value="新增数据")
    public String add(@RequestBody Test test) {
        return "插入数据!";
    }

    @PutMapping("update")
    @ApiOperation(value="更新数据", notes="根据ID更新测试数据")
    public String update(@RequestBody Test test) {
        return String.format("根据主键更新一条记录: %d");
    }

    @DeleteMapping("delete")
    @ApiOperation(value="删除数据", notes="根据ID删除测试数据")
    public String delete(Integer id) {
        return String.format("根据主键删除记录: %d", id);
    }
}