package com.axis.projecteureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.axis.projecteureka.entity.Category;
import com.axis.projecteureka.entity.Product;
import com.axis.projecteureka.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService; 
    @Autowired
	private RestTemplate restTemplate;

    // list all the products
    @GetMapping("/")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> product = productService.listProducts();
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    
    
    @GetMapping("/category/")
	public List<Category> getAllCategories(){
		String url = "http://project-eureka-integration/movies";
		List<Category> categoryList = restTemplate.getForObject(url, List.class);
		return categoryList;
	}

   
}