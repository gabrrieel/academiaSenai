package br.com.academia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity @Table(name="exerc")
	public class ExercModel {
	
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id_exerc;
		private String name;
		private int id_category;
		
		public int getId_exerc() {
			return id_exerc;
		}
		public void setId_exerc(int id_exerc) {
			this.id_exerc = id_exerc;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId_category() {
			return id_category;
		}
		public void setId_category(int id_category) {
			this.id_category = id_category;
		}
		 
		
	}
