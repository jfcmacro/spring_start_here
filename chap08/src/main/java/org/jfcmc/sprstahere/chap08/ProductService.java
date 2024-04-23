package org.jfcmc.sprstahere.chap08;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
	products.add(product);
    }

    public List<Product> findAll() {
	return products;
    }
}
