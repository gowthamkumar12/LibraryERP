package com.library.erp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.erp.model.Category;
import com.library.erp.service.CategoryService;

@RestController
@RequestMapping(value = "/rest/category")
public class CategoryRestController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value = {"/", "/list"})
	public List<Category> all() {
		return categoryService.getAll();
	}

}
