/**
 *
 * @(#) DemoserviceImpl.java
 * @Package com.example.demo.test.service
 * 
 * Copyright  Icerno Corporation. All rights reserved.
 *
 */

package com.example.demo.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.test.dao.DemoDao;
import com.example.demo.test.model.DemoPo;

/**
 *  Description : 
 * 
 *  @author:  王晓祥
 *
 * Create Date：   2019年8月15日 下午4:02:24
 * History:  2019年8月15日 下午4:02:24   王晓祥   Created.
 *           
 */
@Service
public class DemoserviceImpl implements DemoService{

	@Autowired
	private DemoDao demoDao;
	
	@Override
	public DemoPo find(String uuid) {
		
		return demoDao.selectByPrimaryKey(uuid);
	}

}
