package br.com.academia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	@Table(name="category")
	public class CategoryModel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id_category;
		private String name;
		private int id_training;
		
		
		
		public int getId_category() {
			return id_category;
		}
		public void setId_category(int id_category) {
			this.id_category = id_category;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId_training() {
			return id_training;
		}
		public void setId_training(int id_training) {
			this.id_training = id_training;
		}
		
		
		
	}
