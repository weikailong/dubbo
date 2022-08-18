package com.atguigu.gmall;

import com.atguigu.gmall.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author weikailong
 * @date 2022年04月28日
 */
public class MainApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/my-consumer.xml"});

//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        System.out.println(Arrays.toString(beanDefinitionNames));

        OrderService orderService = applicationContext.getBean(OrderService.class);

//        Object userService = applicationContext.getBean("userService");

//        while (true) {
            orderService.initOrder("1");
            Thread.sleep(100);
//        }

//        System.in.read();
    }

}
