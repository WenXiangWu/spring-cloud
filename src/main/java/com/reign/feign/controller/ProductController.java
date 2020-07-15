package com.reign.feign.controller;

import com.reign.productapi.api.IProductService;
import com.reign.productapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ProductController
 * @Description: web
 * @Author: wuwx
 * @Date: 2020-07-15 09:45
 **/
@RestController
@RequestMapping("/web-feign")
public class ProductController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     *实际请求返回的数据
     * @param id
     * @return
     */
    @RequestMapping("/getProductInfo/{id}")
    public Product getProductInfo(@PathVariable int id) {
        return restTemplate.getForObject("http://product-service/service/"+id,Product.class);
    }

    /**
     * 假数据
     * @param id
     * @return
     */
    @RequestMapping("/justGetProductInfo/{id}")
    public Product justGetProductInfo(@PathVariable int id) {
        Product product = new Product("假的",12d,"降级假数据");
        return product;
    }
}
