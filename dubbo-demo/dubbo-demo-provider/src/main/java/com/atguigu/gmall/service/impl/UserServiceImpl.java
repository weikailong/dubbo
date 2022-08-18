package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.UserService;
import com.atguigu.gmall.bean.UserAddress;
import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;

/**
 * @author weikailong
 * @date 2022年04月28日
 */
public class UserServiceImpl implements UserService {

    int cnt = 0;

    @SneakyThrows
    @Override
    public List<UserAddress> getUserAddressList(String userId) {


        System.out.println("收到用户id：" + userId + ", " + (++cnt));

        UserAddress address1 = new UserAddress(1, "西二旗");

        UserAddress address2 = new UserAddress(2, "太阳宫");


//        Thread.sleep(1000);

        return Arrays.asList(address1, address2);

    }
}
