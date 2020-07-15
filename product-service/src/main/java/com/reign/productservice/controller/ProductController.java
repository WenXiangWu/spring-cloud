package com.reign.productservice.controller;

import com.reign.productapi.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ProductController
 * @Description: product
 * @Author: wuwx
 * @Date: 2020-07-15 10:01
 **/
@RestController
@RequestMapping("/service")
public class ProductController {

    @Value("${server.port}")
    private int port;


    @RequestMapping("/{id}")
    public Product getProductInfo(@PathVariable int id){
        //TODO 模拟接口延迟
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Product product = new Product("小米9",2999d,"Are you ok"+port);
        return product;
    }

}
