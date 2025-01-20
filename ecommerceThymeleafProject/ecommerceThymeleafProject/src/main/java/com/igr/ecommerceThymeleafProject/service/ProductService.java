package com.igr.ecommerceThymeleafProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igr.ecommerceThymeleafProject.dto.ProductDTO;
import com.igr.ecommerceThymeleafProject.model.Product;
import com.igr.ecommerceThymeleafProject.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepo;

	
	public Optional<Product> getProductById(Long id) {
		return productRepo.findById(id);
	}
	
	public void addProduct(Product product) {
		productRepo.save(product);	
	}
	
	
	public List<Product> getAllProductsByCategoryId(int id){
		return productRepo.findAllByCategory_Id(id);
		
	}

	public List<Product> getAllProducts() {
		
		return productRepo.findAll();
	}

	
	public void deleteProduct(Long id) {
		productRepo.deleteById(id);
	}
	
}
