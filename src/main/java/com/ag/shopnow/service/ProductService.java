package com.ag.shopnow.service;

import com.ag.shopnow.model.Products;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Products> listProduct = new ArrayList<>(
            Arrays.asList(
                    new Products(1, "Iphone", 12000.00),
                    new Products(338, "MacBook", 1234),
                    new Products(531, "iPad", 5884),
                    new Products(483, "Acer", 58440)
)
    );

    public List<Products> getProducts() {
        return listProduct;
    }

    public Products getProductsById( int productId) {
        return listProduct.stream().filter(p -> p.getProductId() == productId).findFirst().get();
    }

    public void addProducts(Products product) {
        listProduct.add(product);
    }

    public void deleteProduct(int productId) {
        int index = 0;
        for (int i = 0; i < listProduct.size(); i++)
            if(productId == listProduct.get(i).getProductId())
                index = i;

         listProduct.remove( index);
    }


    public void updateProduct(Products products) {
        int index = 0;
        for (int i = 0; i < listProduct.size(); i++)
            if(products.getProductId() == listProduct.get(i).getProductId())
                index = i;

        listProduct.set( index , products);
    }

}
