package com.demoProduct.demoProduct.service;

import com.demoProduct.demoProduct.model.Product;
import com.demoProduct.demoProduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Optional<Product> change(Product account)  {
        if (productRepository.existsById(account.getId())) {
            return Optional.of(productRepository.save(account));
        }
        return Optional.empty();
    }
}

