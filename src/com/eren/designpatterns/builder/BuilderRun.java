package com.eren.designpatterns.builder;

public class BuilderRun {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(12L);
        product1.setDescription("Description");
        product1.setName("Name");

        Product product2 = new Product
                .ProductBuilder()
                .id(12L)
                .name("Name")
                .description("Description")
                .build();
        System.out.println("Product 1: " + product1);
        System.out.println("Product 2: " + product2);
    }
}
