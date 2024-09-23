package com.ag.shopnow.controller;

import com.ag.shopnow.model.Products;
import com.ag.shopnow.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/products")
    public List<Products> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Products getProductsById(@PathVariable int productId) {
        return productService.getProductsById(productId);
    }


    @PostMapping("/products")
    public void addProducts(@RequestBody Products products){
          productService.addProducts(products);
    }
    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId) {
         productService.deleteProduct(productId);
    }
    @PutMapping("/products")
   public void updateProduct(@RequestBody Products products){
         productService.updateProduct(products);
        
   }

}


