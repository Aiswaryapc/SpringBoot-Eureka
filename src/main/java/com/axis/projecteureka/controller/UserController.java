package com.axis.projecteureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.axis.projecteureka.dto.user.SignInDto;
import com.axis.projecteureka.dto.user.SignInResponseDto;
import com.axis.projecteureka.dto.user.SignupDto;
import com.axis.projecteureka.entity.Category;
import com.axis.projecteureka.entity.Product;
import com.axis.projecteureka.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
  	private RestTemplate restTemplate;

    // signup

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }


    // signin

    @PostMapping("/signin")
    public SignInResponseDto signIn(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }
    @GetMapping("/category/")
	public List<Category> getAllCategories(){
		String url = "http://project-eureka-integration/category/";
		List<Category> categoryList = restTemplate.getForObject(url, List.class);
		return categoryList;
	}
    @GetMapping("/product/")
  	public List<Product> getAllProducts(){
  		String url = "http://project-eureka-integration/product/";
  		List<Product> productList = restTemplate.getForObject(url, List.class);
  		return productList;
  	}

}