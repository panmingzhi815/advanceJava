package org.pan.service.impl;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by panmingzhi on 2016/3/3 0003.
 */
public class DubboProvider {

    @Test
    public void provider(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring-config.xml"});
        applicationContext.start();
    }
}
