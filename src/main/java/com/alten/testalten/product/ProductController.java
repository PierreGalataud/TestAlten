package com.alten.testalten.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "products")

public class ProductController {
@Autowired
private ProductService productService;

@Autowired
private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public void addNewProduct(@RequestBody Product product){
        productService.addNewProduct(product);
    }

    @GetMapping("{productId}")
    public Optional<Product> getProductsById(@PathVariable("productId") Long productId){
       return productService.getProductsById(productId);
    }

    @DeleteMapping(path = "{productId}")
    public void deleteProduct(@PathVariable("productId") Long productId){
        productService.deleteProduct(productId);
    }

    @PatchMapping("{productId}")
        public Product updateProductWithMap(@PathVariable("productId") Long productId, @RequestBody Map<Object, Object> objectMap) {
        return productService.updateProductWithMap(productId, objectMap);
    }
}
