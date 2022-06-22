package uz.bob.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.bob.warehouse.entity.Product;
import uz.bob.warehouse.payload.ProductDto;
import uz.bob.warehouse.payload.Result;
import uz.bob.warehouse.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Result addProduct(@RequestBody ProductDto productDto){
        Result result = productService.addProduct(productDto);
        return result;
    }
}
