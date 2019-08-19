package br.com.academia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.academia.daos.UsersDao;
import br.com.academia.models.UsersModel;

	
	@Controller
	public class UsersController {
		
		@Autowired
		public UsersDao usersDao;
		
		@RequestMapping("users/formUsers")
		public String form() {
			System.out.println("Cadastro users");
			return "users/formUsers";
		}
		
		@RequestMapping("users/confirm")
		public String save(UsersModel users) {
			System.out.println("Cadastrado Users");
			usersDao.save(users);
			return "users/confirm";
		}
	}
