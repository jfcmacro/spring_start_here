package org.jfcmc.sprstahere.chap08;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService) {
	this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
	var products = productService.findAll();
	model.addAttribute("products", products);

	return "products.html";
    }

    // @RequestMapping(path = "/products",
    // 		    method = RequestMethod.POST)
    // public String addProduct(@RequestParam String name,
    // 			     @RequestParam double price,
    @PostMapping(path = "/products")
    public String addProduct(Product p,
			     Model model) {
	// Product p = new Product();
	// p.setName(name);
	// p.setPrice(price);

	
	productService.addProduct(p);

	var products = productService.findAll();
	model.addAttribute("products", products);

	return "products.html";
    }
}
