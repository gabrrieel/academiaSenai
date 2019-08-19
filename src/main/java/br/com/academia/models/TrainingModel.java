package br.com.academia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity @Table(name="training")
	public class TrainingModel {
		
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id_training;
		private String name;
		private String id_category;
		
		
		public int getId_training() {
			return id_training;
		}
		public void setId_training(int id_training) {
			this.id_training = id_training;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId_category() {
			return id_category;
		}
		public void setId_category(String id_category) {
			this.id_category = id_category;
		}
	
	
			
	}
	
	
	
