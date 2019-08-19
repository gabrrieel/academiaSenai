package br.com.academia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.academia.daos.CategoryDao;
import br.com.academia.models.CategoryModel;

	
	@Controller
	public class CategoryController {
			
			@Autowired
			public CategoryDao categoryDao;
			
			
			@RequestMapping("category/formCategory")
			public String form() {
				System.out.println("Cadastro Category");
				return "category/formCategory";
			}
			
			@RequestMapping("category/confirm")
			public String save(CategoryModel category) {
				categoryDao.save(category);
				return "category/confirm";
			}
			
		}
