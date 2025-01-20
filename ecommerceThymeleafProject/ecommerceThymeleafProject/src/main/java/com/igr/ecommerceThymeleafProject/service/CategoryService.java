package com.igr.ecommerceThymeleafProject.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igr.ecommerceThymeleafProject.model.Category;
import com.igr.ecommerceThymeleafProject.repository.CategoryRepository;
import com.igr.ecommerceThymeleafProject.repository.ProductRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> getAllCategories(){
		return categoryRepo.findAll();
	}
	
	public void addCats(Category category) {
		categoryRepo.save(category);
		
	}

	public void deleteCategory(int id) {
		categoryRepo.deleteById(id);
		
	}
	
	public Optional<Category> findCategory(int id) {
		return categoryRepo.findById(id);
	}

}
