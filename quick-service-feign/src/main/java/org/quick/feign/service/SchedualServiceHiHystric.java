
/**   
 * 文件名：SchedualServiceHiHystric.java   
 * 作者：Andy  
 * 版本信息： V 1.0  
 * 日期：2019年3月14日   
 * Copyright 足下 Corporation 2019    
 * 版权所有   
 *   
 */
package org.quick.feign.service;

import org.springframework.stereotype.Component;

/**   
 * @author: Andy   
 * @version: 2019年3月14日 下午4:02:14 
 * @desc 熔断回调处理
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}



