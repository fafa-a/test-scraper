package com.fafa;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        try {
            order.run(
                    "https://stockx.com/api/browse?productCategory=sneakers&currency=EUR&_search=CT8527-400&dataType=product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
