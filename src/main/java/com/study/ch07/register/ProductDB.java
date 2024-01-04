package com.study.ch07.register;

public class ProductDB {

    void insertProduct(Product product) {
        System.out.println("DB에 Insert 완료");
        System.out.println("Insert 내용");
        System.out.println("productName: " + product.productName);
        System.out.println("productCode: " + product.productCode);
        System.out.println("productPrice: " + product.productPrice);
        System.out.println();
    }

}
