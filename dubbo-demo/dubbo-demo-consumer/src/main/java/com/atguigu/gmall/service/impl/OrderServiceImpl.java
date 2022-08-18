package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.OrderService;
import com.atguigu.gmall.UserService;
import com.atguigu.gmall.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author weikailong
 * @date 2022年04月28日
 */
@Service
@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String s) {
//        invokeAllRpc(s);
        directRpc(s);
//        oriInvoke(s);
    }

//    public void oriInvoke(String userId) {
//        System.out.println("用户id:" + userId);
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        Future<List<UserAddress>> submit = executorService.submit(() -> {
//            System.out.println("oriInvoke---before---");
//            long taskStart = System.currentTimeMillis();
//            List<UserAddress> userAddressList = null;
//            try {
//                userAddressList = userService.getUserAddressList("1");
//            } catch (Exception e) {
//                System.out.println("oriInvoke----elapse:" + (System.currentTimeMillis() - taskStart) + "-----err--" + e.getMessage());
//            }
//            System.out.println("oriInvoke---after---elapse:" + (System.currentTimeMillis() - taskStart));
//            return userAddressList;
//        });
//
//        List<UserAddress> userAddresses = null;
//        try {
//            userAddresses = submit.get(350, TimeUnit.MILLISECONDS);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        if (userAddresses != null) {
//            for (UserAddress userAddress : userAddresses) {
//                System.out.println("用户地址:" + userAddress.getAddress());
//            }
//        }
//
//        try {
//            Thread.currentThread().join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }


//    public void invokeAllRpc(String userId) {
//
//        System.out.println("用户id:" + userId);
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        long start = System.currentTimeMillis();
//        List<Callable<List<UserAddress>>> tasks = Lists.newArrayList(() -> {
//            System.out.println("---before---");
//            long taskStart = System.currentTimeMillis();
//            List<UserAddress> userAddressList = null;
//            try {
//                userAddressList = userService.getUserAddressList("1");
//            } catch (Exception e) {
//                System.out.println("-----err--" + e.getMessage() + "----elapse:" + (System.currentTimeMillis() - taskStart));
//            }
//            System.out.println("---after---");
//            return userAddressList;
//        });
//
//
//        long invokeAllStart = System.currentTimeMillis();
//
//
//        List<Future<List<UserAddress>>> futures = null;
//        try {
//            futures = executorService.invokeAll(tasks, 350, TimeUnit.MILLISECONDS);
//            for (Future<List<UserAddress>> future : futures) {
//                List<UserAddress> userAddresses = future.get();
//                for (UserAddress userAddress : userAddresses) {
//                    System.out.println("用户地址:" + userAddress.getAddress());
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("---invokeAll err:" + e.getMessage() + ", elapse:" + (System.currentTimeMillis() - invokeAllStart));
//        }
//
//        System.out.println("============ all elapse:" + (System.currentTimeMillis() - start));
//
//        try {
//            Thread.currentThread().join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public void directRpc(String userId) {

        System.out.println("用户id:" + userId);

        long start = System.currentTimeMillis();
        List<UserAddress> userAddressList = userService.getUserAddressList("1");
        for (UserAddress userAddress : userAddressList) {
            System.out.println("用户地址:" + userAddress.getAddress());
        }

        System.out.println("============ all elapse:" + (System.currentTimeMillis() - start));

//        try {
//            Thread.currentThread().join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
