package com.demoProduct.demoProduct;

import com.demoProduct.demoProduct.model.Product;
import com.demoProduct.demoProduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository ;

    public void run(String... args) throws Exception {
        Product product1 = new  Product();
        product1.setDescription("Flag of Spain");
        product1.setName("Country Flag");
        product1.setStock(12);
        product1.setPrice(32.5);
        product1.setImage("https://flagpedia.net/data/flags/icon/72x54/es.png");
        productRepository.save(product1);
        Product product2 = new  Product();
        product2.setDescription("Flag of France");
        product2.setName("Country Flag");
        product2.setStock(8);
        product2.setPrice(29.5);
        product2.setImage("https://flagpedia.net/data/flags/icon/72x54/fr.png");
        productRepository.save(product2);
        Product product3 = new  Product();
        product3.setDescription("Flag of Italy");
        product3.setName("Country Flag");
        product3.setStock(10);
        product3.setPrice(31.5);
        product3.setImage("https://flagpedia.net/data/flags/icon/72x54/it.png");
        productRepository.save(product3);
    }

}
