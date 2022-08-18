package com.atguigu.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author weikailong
 * @date 2022年04月28日
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/my-provider.xml"});


        System.in.read();
    }

}
