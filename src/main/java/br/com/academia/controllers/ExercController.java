package br.com.academia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.academia.daos.ExercDao;
import br.com.academia.models.ExercModel;

 	@Controller
	public class ExercController {
 		
 		@Autowired
 		public ExercDao exercDao;
 		
 		@RequestMapping("exerc/formExerc")
 		public String form() {
 			System.out.println("Gravando Exerc");
 			return "exerc/formExerc";
 		}
 		@RequestMapping("exerc/confirm")
 		public String save (ExercModel exerc) {
 			System.out.println("Cadastrado Exerc");
 			exercDao.save(exerc);
 			return "exerc/confirm";
 		}
		
	}
