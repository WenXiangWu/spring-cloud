package com.reign.productweb.controller;

import com.reign.productapi.api.IProductService;
import com.reign.productapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProductController
 * @Description: web
 * @Author: wuwx
 * @Date: 2020-07-15 09:45
 **/
@RestController
@RequestMapping("/web")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/getProductInfo/{id}")
    public Product getProductInfo(@PathVariable int id) {
        return productService.getProductInfo(id);
    }

}
