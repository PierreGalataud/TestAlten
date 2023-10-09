package com.alten.testalten.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository){
        return args -> {
            Product p0 = new Product (
                    "f230fh0g3",
                    "Bamboo Watch",
                    "Product Description",
                    "bamboo-watch.jpg",
                    65.0F,
                    "Accessories",
                    24.0F,
                    "INSTOCK",
                    5.0F
            );
            Product p1 = new Product (
                    "nvklal433",
                    "Black Watch",
                    "Product Description",
                    "black-watch.jpg",
                    72.0F,
                    "Accessories",
                    61.0F,
                    "INSTOCK",
                    4.0F
            );
            Product p2 = new Product (
                    "zz21cz3c1",
                    "Blue Band",
                    "Product Description",
                    "blue-band.jpg",
                    79.0F,
                    "Fitness",
                    2.0F,
                    "LOWSTOCK",
                    3.0F
            );
            Product p3 = new Product (
                    "244wgerg2",
                    "Blue T-Shirt",
                    "Product Description",
                    "blue-t-shirt.jpg",
                    29.0F,
                    "Clothing",
                    25.0F,
                    "INSTOCK",
                    5.0F
            );
            Product p4 = new Product (
                    "h456wer53",
                    "Bracelet",
                    "Product Description",
                    "bracelet.jpg",
                    15.0F,
                    "Accessories",
                    73.0F,
                    "INSTOCK",
                    4.0F
            );
            Product p5 = new Product (
                    "av2231fwg",
                    "Brown Purse",
                    "Product Description",
                    "brown-purse.jpg",
                    120.0F,
                    "Accessories",
                    0.0F,
                    "OUTOFSTOCK",
                    4.0F
            );
            Product p6 = new Product (
                    "bib36pfvm",
                    "Chakra Bracelet",
                    "Product Description",
                    "chakra-bracelet.jpg",
                    32.0F,
                    "Accessories",
                    5.0F,
                    "LOWSTOCK",
                    3.0F
            );
            Product p7 = new Product (
                    "mbvjkgip5",
                    "Galaxy Earrings",
                    "Product Description",
                    "galaxy-earrings.jpg",
                    34.0F,
                    "Accessories",
                    23.0F,
                    "INSTOCK",
                    5.0F
            );
            Product p8 = new Product (
                    "vbb124btr",
                    "Game Controller",
                    "Product Description",
                    "game-controller.jpg",
                    99.0F,
                    "Electronics",
                    2.0F,
                    "LOWSTOCK",
                    4.0F
            );
            Product p9 = new Product (
                    "cm230f032",
                    "Gaming Set",
                    "Product Description",
                    "gaming-set.jpg",
                    299.0F,
                    "Electronics",
                    63.0F,
                    "INSTOCK",
                    3.0F
            );
            Product p10 = new Product (
                    "plb34234v",
                    "Gold Phone Case",
                    "Product Description",
                    "gold-phone-case.jpg",
                    24.0F,
                    "Accessories",
                    0.0F,
                    "OUTOFSTOCK",
                    4.0F
            );
            Product p11 = new Product (
                    "4920nnc2d",
                    "Green Earbuds",
                    "Product Description",
                    "green-earbuds.jpg",
                    89.0F,
                    "Electronics",
                    23.0F,
                    "INSTOCK",
                    4.0F
            );
            Product p12 = new Product (
                    "250vm23cc",
                    "Green T-Shirt",
                    "Product Description",
                    "green-t-shirt.jpg",
                    49.0F,
                    "Clothing",
                    74.0F,
                    "INSTOCK",
                    5.0F
            );
            Product p13 = new Product (
                    "fldsmn31b",
                    "Grey T-Shirt",
                    "Product Description",
                    "grey-t-shirt.jpg",
                    48.0F,
                    "Clothing",
                    0.0F,
                    "OUTOFSTOCK",
                    3.0F
            );
            Product p14 = new Product (
                    "waas1x2as",
                    "Headphones",
                    "Product Description",
                    "headphones.jpg",
                    175.0F,
                    "Electronics",
                    8.0F,
                    "LOWSTOCK",
                    5.0F
            );
            Product p15 = new Product (
                    "vb34btbg5",
                    "Light Green T-Shirt",
                    "Product Description",
                    "light-green-t-shirt.jpg",
                    49.0F,
                    "Clothing",
                    34.0F,
                    "INSTOCK",
                    4.0F
            );
            Product p16 = new Product (
                    "k8l6j58jl",
                    "Lime Band",
                    "Product Description",
                    "lime-band.jpg",
                    79.0F,
                    "Fitness",
                    12.0F,
                    "INSTOCK",
                    3.0F
            );
            Product p17 = new Product (
                    "v435nn85n",
                    "Mini Speakers",
                    "Product Description",
                    "mini-speakers.jpg",
                    85.0F,
                    "Clothing",
                    42.0F,
                    "INSTOCK",
                    4.0F
            );
            Product p18 = new Product (
                    "09zx9c0zc",
                    "Painted Phone Case",
                    "Product Description",
                    "painted-phone-case.jpg",
                    56.0F,
                    "Accessories",
                    41.0F,
                    "INSTOCK",
                    5.0F
            );
            Product p19 = new Product (
                    "mnb5mb2m5",
                    "Pink Band",
                    "Product Description",
                    "pink-band.jpg",
                    79.0F,
                    "Fitness",
                    63.0F,
                    "INSTOCK",
                    4.0F
            );
            Product p20 = new Product (
                    "r23fwf2w3",
                    "Pink Purse",
                    "Product Description",
                    "pink-purse.jpg",
                    110.0F,
                    "Accessories",
                    0.0F,
                    "OUTOFSTOCK",
                    4.0F
            );
            Product p21 = new Product (
                    "pxpzczo23",
                    "Purple Band",
                    "Product Description",
                    "purple-band.jpg",
                    79.0F,
                    "Fitness",
                    6.0F,
                    "LOWSTOCK",
                    3.0F
            );
            Product p22 = new Product (
                    "2c42cb5cb",
                    "Purple Gemstone Necklace",
                    "Product Description",
                    "purple-gemstone-necklace.jpg",
                    45.0F,
                    "Accessories",
                    62.0F,
                    "INSTOCK",
                    4.0F
            );
            Product p23 = new Product (
                    "5k43kkk23",
                    "Purple T-Shirt",
                    "Product Description",
                    "purple-t-shirt.jpg",
                    49.0F,
                    "Clothing",
                    2.0F,
                    "LOWSTOCK",
                    5.0F
            );
            Product p24 = new Product (
                    "lm2tny2k4",
                    "Shoes",
                    "Product Description",
                    "shoes.jpg",
                    64.0F,
                    "Clothing",
                    0.0F,
                    "INSTOCK",
                    4.0F
            );
            Product p25 = new Product (
                    "nbm5mv45n",
                    "Sneakers",
                    "Product Description",
                    "sneakers.jpg",
                    78.0F,
                    "Clothing",
                    52.0F,
                    "INSTOCK",
                    4.0F
            );
            Product p26 = new Product (
                    "zx23zc42c",
                    "Teal T-Shirt",
                    "Product Description",
                    "teal-t-shirt.jpg",
                    49.0F,
                    "Clothing",
                    3.0F,
                    "LOWSTOCK",
                    3.0F
            );
            Product p27 = new Product (
                    "acvx872gc",
                    "Yellow Earbuds",
                    "Product Description",
                    "yellow-earbuds.jpg",
                    89.0F,
                    "Electronics",
                    35.0F,
                    "INSTOCK",
                    3.0F
            );
            Product p28 = new Product (
                    "tx125ck42",
                    "Yoga Mat",
                    "Product Description",
                    "yoga-mat.jpg",
                    20.0F,
                    "Fitness",
                    15.0F,
                    "INSTOCK",
                    5.0F
            );
            Product p29 = new Product (
                    "gwuby345v",
                    "Yoga Set",
                    "Product Description",
                    "yoga-set.jpg",
                    20.0F,
                    "Fitness",
                    25.0F,
                    "INSTOCK",
                    8.0F
            );

           repository.saveAll(
                   List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29)
           );
        };
    }
}
