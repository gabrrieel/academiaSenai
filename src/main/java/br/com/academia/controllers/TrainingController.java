package br.com.academia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.academia.daos.TrainingDao;
import br.com.academia.models.TrainingModel;


	@Controller
	public class TrainingController {
		
		@Autowired
		public TrainingDao trainingDao;
		
		@RequestMapping("training/formTraining")
		public String forms() {
			System.out.println("Gravando training");
			return "training/formTraining";
		}
		
		@RequestMapping("training/confirm")
		public String save(TrainingModel training) {
			System.out.println("Cadastrado training");
			trainingDao.save(training);
			return "training/confirm";
		}
	}
