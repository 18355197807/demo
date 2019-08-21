/**
 *
 * @(#) DemoService.java
 * @Package com.example.demo.test.service
 * 
 * Copyright  Icerno Corporation. All rights reserved.
 *
 */

package com.example.demo.test.service;

import com.example.demo.test.model.DemoPo;

/**
 *  Description : 
 * 
 *  @author:  王晓祥
 *
 * Create Date：   2019年8月15日 下午4:02:08
 * History:  2019年8月15日 下午4:02:08   王晓祥   Created.
 *           
 */
public interface DemoService {

	DemoPo find(String uuid);

}
