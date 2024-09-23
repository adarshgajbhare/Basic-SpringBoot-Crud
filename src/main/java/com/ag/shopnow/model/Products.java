package com.ag.shopnow.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Products {

    private int productId;
    private String productName;
    private double price;


}
