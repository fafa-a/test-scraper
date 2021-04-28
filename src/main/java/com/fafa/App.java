package com.fafa;

import java.net.URL;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "https://stockx.com/api/browse?productCategory=sneakers&currency=EUR&_search=CZ9084-001&dataType=product");
            url.getContent();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
