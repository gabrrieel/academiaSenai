package br.com.academia.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.academia.models.ExercModel;

	@Repository 
	@Transactional
	public class ExercDao {
		
		@PersistenceContext
		private EntityManager manager;
		
		public void save(ExercModel exerc) {
			manager.persist(exerc);
		}
	}
