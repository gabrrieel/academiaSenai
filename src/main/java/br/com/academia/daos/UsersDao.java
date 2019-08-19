package br.com.academia.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.academia.models.UsersModel;

	@Repository 
	@Transactional
	public class UsersDao {
		
		@PersistenceContext
		private EntityManager manager;
		
		public void save(UsersModel users) {
			manager.persist(users);
		}
	
	}
