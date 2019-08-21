/**
 *
 * @(#) DemoController.java
 * @Package com.example.demo.test.controller
 * 
 * Copyright  Icerno Corporation. All rights reserved.
 *
 */

package com.example.demo.test.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.test.model.DemoPo;
import com.example.demo.test.service.DemoService;

/**
 *  Description : 
 * 
 *  @author:  王晓祥
 *
 * Create Date：   2019年8月15日 下午3:58:34
 * History:  2019年8月15日 下午3:58:34   王晓祥   Created.
 *           
 */
@Api(value = "demo")
@RestController
@RequestMapping("demo")
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@GetMapping("find")
    @ApiOperation(value="获取uuid数据", notes="根据uuid获取某条测试数据")
    public DemoPo find(String uuid) {
        return demoService.find(uuid);
    }
}
