package com.reign.productapi.api;

import com.reign.productapi.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: IProductService
 * @Description: feign
 * @Author: wuwx
 * @Date: 2020-07-15 09:47
 **/
@FeignClient(name = "product-service")
public interface IProductService {

    @RequestMapping(value = "/service/{id}", method = RequestMethod.GET)
    public Product getProductInfo(@PathVariable int id);
}
