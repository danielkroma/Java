package com.dio;

import com.dio.base.Order;

public class MyFristProgram {
    public static void main(String[] args) throws Exception {
        final Order order = new Order("code: 1234");
        System.out.println(order);
    }
}
