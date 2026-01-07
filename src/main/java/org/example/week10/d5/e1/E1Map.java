package org.example.week10.d5.e1;

import java.util.LinkedHashMap;
import java.util.Map;

public class E1Map {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> productPrices = new LinkedHashMap<>();
        productPrices.put("Laptop", 1200.99);
        productPrices.put("Smartphone", 799.99);
        productPrices.put("Tablet", 499.99);
        productPrices.put("Smartwatch", 199.99);
        productPrices.put("Headphones", 149.99);
        System.out.println("Product Catalog:");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println( entry.getKey() + "," + entry.getValue());
        }
    }
}
