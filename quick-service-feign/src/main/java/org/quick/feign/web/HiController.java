
/**   
 * 文件名：HiController.java   
 * 作者：Andy  
 * 版本信息： V 1.0  
 * 日期：2019年3月14日   
 * Copyright 足下 Corporation 2019    
 * 版权所有   
 *   
 */
package org.quick.feign.web;

import org.quick.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**   
 * @author: Andy   
 * @version: 2019年3月14日 下午3:46:08 
 * @desc 描述该类
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}


