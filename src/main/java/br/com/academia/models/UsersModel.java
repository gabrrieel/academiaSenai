package br.com.academia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity	@Table(name="users")
	public class UsersModel {
		
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id_users;
		private String name;
		private String login;
		private String senha;
		private String privilegios;
		private double peso;
		private double altura;
		private String nascimento;
		
		
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public String getNascimento() {
			return nascimento;
		}
		public void setNascimento(String nascimento) {
			this.nascimento = nascimento;
		}
		public int getId_users() {
			return id_users;
		}
		public void setId_users(int id_users) {
			this.id_users = id_users;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getPrivilegios() {
			return privilegios;
		}
		public void setPrivilegios(String privilegios) {
			this.privilegios = privilegios;
		}
		
		
		
	}
