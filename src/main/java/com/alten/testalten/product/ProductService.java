package com.alten.testalten.product;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;


import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Transactional
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Transactional
    public void addNewProduct(Product product) {
        productRepository.save(product);
    }
    @Transactional
    public Optional<Product> getProductsById(Long productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if (optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            return productRepository.findById(productId);
        } else {
            throw new IllegalStateException(
                    "Product with id :" + productId + " is not in our database"
            );
        }
    }

    @Transactional
    public void deleteProduct(Long productId) {
        boolean exists = productRepository.existsById(productId);
        if(!exists){
            throw new IllegalStateException("Product with id :" + productId + " is not in our database");
        }
        productRepository.deleteById(productId);
    }

    @Transactional
    public Product updateProductWithMap(Long productId, Map<Object, Object> objectMap) {
        Optional<Product> optionalProduct = productRepository.findById(productId);

        if(optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            objectMap.forEach((key, value) -> {
                Field field = ReflectionUtils.findField(Product.class, (String) key);
                field.setAccessible(true);
                if(value instanceof Integer){
                    float valueFloat = ((Integer) value).floatValue();
                    ReflectionUtils.setField(field, product, valueFloat);
                } else {
                    ReflectionUtils.setField(field, product, value);
                }
            });
            return productRepository.save(product);
        } else {
            throw new IllegalStateException(
                    "Product with id :" + productId + " is not in our database"
            );
        }

    }

}
